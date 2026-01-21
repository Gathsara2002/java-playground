package oop.abstraction;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:21 AM
 **/

public class Main {
    public static void main(String[] args) {

        //Abstraction - Hiding the implementation details and provide essential features.
        //Abstract can be achieved using abstract classes and interfaces
        //Abstract class can hold abstract methods and concrete methods but interface can only have abstract methods

        //Shape shape = new Shape();  // cant create object because shape is abstract class

        Circle circle = new Circle(7);
        System.out.printf("Area is %.2f %n", circle.area());
        circle.print();

        Triangle triangle = new Triangle(4, 8);
        System.out.println(triangle.area());
        triangle.print();
    }
}
