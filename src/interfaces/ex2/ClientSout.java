package interfaces.ex2;

import java.time.LocalDateTime;

public class ClientSout implements DateTimeClient {

    @Override
    public void sendCurrentTime(LocalDateTime localDateTime) {
        System.out.println("Current date and time is: " + localDateTime);
    }
}
