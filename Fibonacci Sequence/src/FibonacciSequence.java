import java.util.ArrayList;
import java.util.Scanner;

/**
 * what is FibonacciSequence: https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 */
public class FibonacciSequence {

    /**
     * The entry point of the program.
     *
     * @param args The command-line arguments.
     */

    public static void main(String[] args) {

        System.out.println("FibonacciSequence are: " + listOfFinonacciSeq(askNumber("Enter a number until get the FibonacciSequence!:  ")));

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
     * Generates a list of Fibonacci sequence up to a given number.
     *
     * @param number The upper limit of the Fibonacci sequence (inclusive).
     * @return The list of Fibonacci sequence up to the given number.
     */
    public static ArrayList<Integer> listOfFinonacciSeq(int number) {

        ArrayList<Integer> listOfFinonacciSeq = new ArrayList();

        listOfFinonacciSeq.add(1);
        listOfFinonacciSeq.add(1);

        for (int i = 1; i <= number; i++) {

            if (listOfFinonacciSeq.get(listOfFinonacciSeq.size()-1) < number) {
                listOfFinonacciSeq.add(listOfFinonacciSeq.get(listOfFinonacciSeq.size() - 1) + listOfFinonacciSeq.get(listOfFinonacciSeq.size() - 2));
            }
        }
        // remove last term
        listOfFinonacciSeq.remove(listOfFinonacciSeq.size() - 1);

        return listOfFinonacciSeq;
    }
}