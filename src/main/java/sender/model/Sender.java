package sender.model;

import java.time.LocalDateTime;

public abstract class Sender implements Sendible {
    @Override
    public void send(String message) {
        System.out.println(LocalDateTime.now() + " Message: '" + message + "' sent from "
                + this.getClass().getSimpleName());
    }
}
