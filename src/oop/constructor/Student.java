package oop.constructor;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 3:44 PM
 **/

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //default constructor
    public Student() {
        System.out.println("this is default constructor");
    }

    public Student(String name, int age, double gpa, boolean isEnrolled) {
        //Use this keyword to identify object attribute not constructor parameter
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    public Student(String name) {
        this(); //Call default constructor if object create using this constructor. It is called constructor chaining
        this.name = name;
    }
}
