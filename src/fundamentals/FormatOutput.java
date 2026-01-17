package fundamentals;

/**
 * @author : Gathsara
 * created : 12/30/2025 -- 5:21 PM
 **/

public class FormatOutput {
    public static void main(String[] args) {

        //printf() - used to format output

        String name = "John";
        char firstLetter = 'J';
        int age = 20;
        double height = 181.5;
        boolean isStudent = true;

        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your name start with %c\n", firstLetter);
        System.out.printf("Your age is  %d\n", age);
        System.out.printf("Your height is  %.1f\n", height);
        System.out.printf("Your are student : %b\n", isStudent);

        System.out.printf("%s is %d year old\n", name, age);
    }
}
