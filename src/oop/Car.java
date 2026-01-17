package oop;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 3:24 PM
 **/

public class Car {

    //Class is a blueprint of the object

    String model = "Mustang";
    int year=2020;
    double price = 200000.99;
    boolean isRunning=true;

    void start(){
        System.out.println("Engine started");
    }

    void stop(){
        System.out.println("Engine stopped");
    }
}
