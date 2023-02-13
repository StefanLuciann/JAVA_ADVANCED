package concurencys.ex1;

public class Thread1 extends Thread {
    private String message;

    public Thread1(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
