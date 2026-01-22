package oop.multithreading;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 5:20 PM
 **/

public class MyThread implements Runnable {

    private final String text;

    public MyThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(text);

        }
    }
}
