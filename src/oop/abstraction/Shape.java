package oop.abstraction;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:22 AM
 **/

public abstract class Shape {

    abstract double area(); //abstract

    void print(){           // concrete method
        System.out.println("Concrete method");
    }
}
