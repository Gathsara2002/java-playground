package fundamentals;

/**
 * @author : Gathsara
 * created : 12/30/2025 -- 4:49 PM
 **/

public class Conditions {
    public static void main(String[] args) {

        //fundamentals.Conditions let you control the flow of the program

        //If statement - performs a block of code if condition is true
        //Else - performs a block of code if condition is false
        int age = 15;
        if (age >= 18) {
            System.out.println("Your are an adult");
        } else {
            System.out.println("Your are a child");
        }

        //Else if - to specify a new condition to test, if the first condition is false
        age = 20;
        if (age >= 18) {
            System.out.println("Your are an adult");
        } else if (age < 0) {
            System.out.println("Your are not born yet");
        } else {
            System.out.println("Your are a child");
        }

        //ternary operator
        //Variable  = (Condition) ? if true : if false

        int marks = 46;
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        String result = (marks >= 35) ? "Pass" : "Fail";
        System.out.println(result);

        System.out.println((marks >= 35) ? "Pass" : "Fail");

        result = (marks <= 35) ? "Fail" : (marks > 35 && marks <= 50) ? "S" : (marks > 50 && marks <= 75) ? "B" : "A";
        System.out.println("Result : " + result);
    }
}
