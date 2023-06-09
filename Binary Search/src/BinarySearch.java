import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;


/**
 * Implement a binary search algorithm to find the index of a given element in a sorted array. If the element is not found, return -1.
 * binarySearch methods https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#binarySearch-int:A-int-
 *
 */
public class BinarySearch {

    public static void main(String[] args) {

        int enteredValue = askNumber("Enter a number to look for in a random Array of a range of 50: ");

        int[] matrix50 = create50RandonNumbersInArray();
        Arrays.sort(matrix50);

        int index = binarySearch(matrix50, enteredValue);

        printMatriz("Here are the matrix with the all 50 values from 0 to 100", matrix50);

        // this is because (-(insertion point) - 1).

        if (index <= -1) {
            System.out.println();
            System.out.println("-1");
            ;
        } else {
            System.out.println();
            System.out.println("Here the index: " + index);
        }

    }

    /**
     * Prompts the user with a message and returns the input int.
     *
     * @param Message The message to display to the user.
     * @return The int entered by the user.
     */
    public static int askNumber(String Message) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print(Message);

        return scannerObj.nextInt();
    }

    /**
     * Creates a one-dimensional matrix based on randoms number from 0 to 100.
     *
     * @return The created matrix as a one-dimensional array.
     */

    public static int[] create50RandonNumbersInArray() {

        int[] matrix = new int[50];

        for (int i = 0; i < 50; i++) {
            matrix[i] = (int) (Math.random() * 101);
        }
        return matrix;
    }



    /**
     * Prints the given matrix to the console.
     *
     * @param Message The message to be displayed before printing the matrix.
     * @param matrix  The matrix to be printed.
     */
    public static void printMatriz(String Message, int[] matrix) {

        System.out.println(Message);

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i] + ",   ");
        }
    }
}