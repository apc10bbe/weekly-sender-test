package sender.service;

import java.time.DayOfWeek;
import sender.model.Sender;

public interface SenderFactory {
    Sender getSender(DayOfWeek day);
}
