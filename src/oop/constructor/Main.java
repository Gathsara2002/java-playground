package oop.constructor;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 3:43 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Constructor - special method that is called automatically when creating an object using new keyword.
        // It is job to initialize the state of the object

        Student student1 = new Student("Alex", 20, 3.9, true);
        Student student2 = new Student("Same", 20, 3.1, false);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        //Constructor chaining
        Student daniel = new Student("Daniel");
        System.out.println(daniel.name);


    }
}
