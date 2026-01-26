package advanced.raceCondition;

/**
 * @author : Gathsara
 * created : 1/24/2026 -- 7:36 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Race condition - situation where the output or behavior of your software depends on the "race" between two or more threads.
        //                 It happens when multiple threads try to access and change shared data at the same time

        Counter counter = new Counter();

        Runnable thread1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Runnable thread2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.count);
    }
}
