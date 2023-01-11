package sender.service;

import java.time.DayOfWeek;
import sender.model.Fax;
import sender.model.Mail;
import sender.model.Printer;
import sender.model.Sender;

public class SenderFactoryImpl implements SenderFactory {
    @Override
    public Sender getSender(DayOfWeek day) {
        Sender sender = null;
        switch (day) {
            case MONDAY:
                sender = new Printer();
                break;
            case WEDNESDAY:
                sender = new Fax();
                break;
            case FRIDAY:
                sender = new Mail();
                break;
            default:
                throw new IllegalStateException("Wrong day of week: " + day);
        }
        return sender;
    }
}
