/**
 * @author : Gathsara
 * created : 1/17/2026 -- 1:08 PM
 **/

public class VariableArguments {
    public static void main(String[] args) {

        //Varargs - allow methods to accept vary number of arguments of specific type
        // Compiler consider varargs as an array.
        //Only one varargs can be in a method.
        //Varargs must be the last argument.

        printNumbers(1, 2, 3);      // Pass 3 arguments
        System.out.println();
        printNumbers(10, 20);       // Pass 2 arguments
        System.out.println();
        printNumbers();             // Pass 0 arguments (valid!)
        System.out.println();
        printNumbers(new int[]{5}); // Pass an actual array (also valid!)
        System.out.println();
    }

    static void printNumbers(int... numbers) {
        // Inside the method, 'numbers' is treated exactly like an int[] array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
