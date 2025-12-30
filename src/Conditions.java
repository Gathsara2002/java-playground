/**
 * @author : Gathsara
 * created : 12/30/2025 -- 4:49 PM
 **/

public class Conditions {
    public static void main(String[] args) {

        //Conditions let you control the flow of the program

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
    }
}
