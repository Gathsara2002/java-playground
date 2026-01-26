package advanced.multithreading;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 5:19 PM
 **/

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread("Ping"));
        Thread thread2 = new Thread(new MyThread("Pong"));

        System.out.println("Game start");
        thread1.start();
        thread2.start();
        //Main thread wait till other threads over
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Game over");
    }
}
