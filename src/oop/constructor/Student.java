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
    }

    public Student(String name, int age, double gpa, boolean isEnrolled) {
        //Use this keyword to identify object attribute not constructor parameter
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
}
