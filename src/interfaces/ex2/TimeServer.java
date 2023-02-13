package interfaces.ex2;

import java.time.LocalDateTime;

public class TimeServer {
    private DateTimeClient[] clients;

    public TimeServer(DateTimeClient[] clients) {
        this.clients = clients;
    }

    public void notifyClients() {
        for (DateTimeClient client : clients) {
            client.sendCurrentTime(LocalDateTime.now());
        }
    }

}