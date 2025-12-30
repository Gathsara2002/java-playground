import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 12/30/2025 -- 12:00 PM
 **/

public class KeyboardInput {
    public static void main(String[] args) {

        //To keyboard input used scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
