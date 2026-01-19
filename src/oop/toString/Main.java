package oop.toString;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 10:11 AM
 **/

public class Main {
    public static void main(String[] args) {

        //ToString() - Inherit from object class. Object class is the super class for every class.
        //It provides string representation of the object (hash code)

        Car car = new Car("Audi", 2024, "Black");
        System.out.println(car.toString());
    }
}
