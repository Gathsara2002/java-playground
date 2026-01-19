package fundamentals;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 4:09 PM
 **/

public class ExceptionHandling {
    public static void main(String[] args) {

        //Exception - An event interrupts the normal flow of the code

        try {
            int sum = 4 / 0;
            System.out.println(sum);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }finally {
            System.out.println("This run no matter what happen");
        }
    }
}
