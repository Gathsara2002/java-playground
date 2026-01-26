package advanced.oop.inheritance;

/**
 * @author : Gathsara
 * created : 1/18/2026 -- 7:09 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Inheritance - child(subclass) class acquires variables and methods from parent(superclass) class

        Dog dog = new Dog();
        System.out.println(dog.isAlive);
        dog.eat();
        dog.speak();

        Cat cat = new Cat();
        System.out.println(cat.isAlive);
        cat.eat();
        cat.speak();

        Plant plant=new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();

        //Super - used to refer superclass
    }
}
