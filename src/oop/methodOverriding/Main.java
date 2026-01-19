package oop.methodOverriding;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 10:03 AM
 **/

public class Main {
    public static void main(String[] args) {

        //Method overriding - when subclass provides it own method implementation without using superclass method

        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.move();  // call move() in animal class
        fish.move();  // call move() in fish class because animal class move() override in fish class
    }
}
