package fundamentals;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 10:27 AM
 **/

public class Arrays {
    public static void main(String[] args) {

        //Array - arrays is fixed sized data container used to store same data type
        //Cannot change size dynamically

        /*String[] fruits = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Grapes";
        fruits[3] = "Banana";
        fruits[4] = "Mango";

        System.out.println("First element is: " + fruits[0]);
        System.out.println("Last element is: " + fruits[fruits.length - 1]);
        System.out.println("Array length is: " + fruits.length);

        //For each
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Sort
        java.util.fundamentals.Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }*/

        //userInputArray();
        optimizedDynamicArray();

    }

    //User input add to array
    static void userInputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] finalArray = new int[0]; // Start with size 0

        while (true) {
            System.out.print("Input a number: ");
            int num = scanner.nextInt();
            scanner.nextLine(); // CRITICAL: Clear the buffer after nextInt()

            // 1. Create a larger temporary array
            int[] temp = new int[finalArray.length + 1];

            // 2. MANUAL COPY: Move items from finalArray to temp
            for (int i = 0; i < finalArray.length; i++) {
                temp[i] = finalArray[i];
            }

            // 3. Add the new number to the last slot
            temp[temp.length - 1] = num;

            // 4. Update the reference (The original array is now garbage collected)
            finalArray = temp;

            System.out.print("Press 'Q' to exit, or Enter to add more: ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Q")) {
                break;
            }
        }

        System.out.println("--- Your Final Dynamic Array ---");
        for (int i : finalArray) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    //double array size when if it is full
    static void optimizedDynamicArray() {
        Scanner scanner = new Scanner(System.in);
        int[] finalArray = new int[2]; // Start with capacity 2
        int count = 0; // Number of items currently added

        while (true) {
            System.out.print("Input a number: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            // Check if we are full
            if (count == finalArray.length) {
                System.out.println("--- Array full! Doubling size to " + (finalArray.length * 2) + " ---");

                // 1. Create a double-sized array
                int[] temp = new int[finalArray.length * 2];

                // 2. Manual copy
                for (int i = 0; i < finalArray.length; i++) {
                    temp[i] = finalArray[i];
                }

                // 3. Reassign
                finalArray = temp;
            }

            // Add the number and increment count
            finalArray[count] = num;
            count++;

            System.out.print("Press 'Q' to exit: ");
            if (scanner.nextLine().equalsIgnoreCase("Q")) break;
        }

        // Print only the filled part
        System.out.println("Final Array:");
        for (int i = 0; i < count; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
