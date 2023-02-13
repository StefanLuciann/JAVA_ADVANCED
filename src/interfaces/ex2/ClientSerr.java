package interfaces.ex2;

import java.time.LocalDateTime;

public class ClientSerr implements DateTimeClient{
    @Override
    public void sendCurrentTime(LocalDateTime localDateTime) {
        System.err.println("Current date and time is: " +localDateTime);
    }
}
