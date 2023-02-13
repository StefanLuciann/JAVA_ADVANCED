package interfaces.ex2;

/**
 * Suppose you have written a time server that periodically notifies its clients of the current date and time.
 * Write an interface the server could use to enforce a particular protocol on its clients.
 */
public class Main {
    public static void main(String[] args) {

DateTimeClient[] dateTimeClients = new DateTimeClient[2];
        dateTimeClients[0] = new ClientSout();
        dateTimeClients[1] = new ClientSerr();

        TimeServer timeServer = new TimeServer(dateTimeClients);
        timeServer.notifyClients();
        timeServer.notifyClients();
        timeServer.notifyClients();
        timeServer.notifyClients();
        timeServer.notifyClients();
    }
}
