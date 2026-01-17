/**
 * @author : Gathsara
 * created : 1/17/2026 -- 1:22 PM
 **/

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //2D Array - Which is an arrays inside another array. Each element of parent array store another arrays.

        // Syntax: dataType[][] arrayName = new dataType[rows][columns];
        int[][] arr = new int[3][4]; // 3 rows and 4 columns

        int[][] jagged = new int[3][]; // Define 3 rows, but don't define columns yet
        jagged[0] = new int[2]; // Row 0 has 2 columns
        jagged[1] = new int[5]; // Row 1 has 5 columns
        jagged[2] = new int[3]; // Row 2 has 3 columns

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < matrix.length; i++) {         // Outer loop (Rows)
            for (int j = 0; j < matrix[i].length; j++) { // Inner loop (Columns)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        System.out.println("======================");
        transpose();
    }

    static void transpose() {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] updatedMatrix = new int[2][3];

        System.out.println("Before");
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        //transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                updatedMatrix[j][i]=matrix[i][j];
            }
        }

        System.out.println("After");
        for (int[] numbers : updatedMatrix) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
