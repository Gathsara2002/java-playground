package oop.thread;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 4:33 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Thread - allows run multiple background programmes simultaneously
        //Threads can create using Thread class or runnable interface

        Scanner scanner = new Scanner(System.in);
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setDaemon(true);   //Default every thread is user thread. with this thread turn into daemon thread (low priority threads)
        thread.start();

        System.out.println("You hav 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String response = scanner.nextLine();
        System.out.println("Hello " + response);

        scanner.close();
    }
}
