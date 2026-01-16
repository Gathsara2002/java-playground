import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/16/2026 -- 2:19 PM
 **/

public class Loops {
    public static void main(String[] args) {

        //While loop - repeat block of code until condition is true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name : ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();
    }
}
