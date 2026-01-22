package oop.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 3:09 PM
 **/

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if (count<0){
                    System.out.println("Timer stopped");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 3000, 2000);
    }
}
