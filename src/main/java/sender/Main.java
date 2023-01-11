package sender;

import java.time.DayOfWeek;
import java.time.LocalDate;
import sender.model.Sender;
import sender.service.SenderFactory;
import sender.service.SenderFactoryImpl;

public class Main {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactoryImpl();
        DayOfWeek day = DayOfWeek.FRIDAY; // switch days of week to test output
        Sender sender = factory.getSender(day);
        sender.send("hello");

        // Here output for current day of week
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        Sender senderOfCurrentDay = factory.getSender(currentDay);
        senderOfCurrentDay.send("another message");
    }
}
