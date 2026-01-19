package oop.encapsulation;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 9:25 AM
 **/

public class Main {
    public static void main(String[] args) {


        //Encapsulation - hidden sensitive data from users (Wrapping data into single unit)
        //To achieve encapsulation make attributes private and provide public getter and setter methods to access those attributes
        //Encapsulation is used to validate data

        Human human = new Human();

        human.setAge(24);
        System.out.println(human.getAge());

        human.setName("Ryan");
        System.out.println(human.getName());

    }
}
