package concurencys.ex1;

/**
 * - Inherit a class from Thread and override the run( ) method.
 * - Inside run( ), print a message, and then call sleep( ).
 * - Repeat this three times, then return from run( ).
 * - Put a start-up message in the constructor.
 * <p>
 * - Make a separate thread class that calls System.gc( ) and System.runFinalization( ) inside run( ), printing a message as it does so.
 * - Make several thread objects of both types and run them to see what happens.
 * - Experiment with different sleep times to see what happens.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread1 thread1 = new Thread1("Thread " + i);
            thread1.start();
        }
        for (int i = 0; i < 2; i++) {
            Thread thread2 = new Thread(new Thread2());
            thread2.start();
        }
    }
}
