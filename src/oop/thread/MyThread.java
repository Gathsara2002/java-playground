package oop.thread;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 5:01 PM
 **/

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Something happen");
            }
            if (i == 10) {
                System.out.println("Times up");
                System.exit(0);  //Exist main thread
            }
        }
    }
}
