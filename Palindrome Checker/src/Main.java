import java.util.Scanner;
import java.lang.*;


/**
 * This class provides functionality to check whether a word is a palindrome or not.
 * It prompts the user to enter a word, performs the palindrome check, and displays the result.
 */

public class Main {

    public static void main(String[] args) {

        String word = askString("Enter a word to check the palindrome: ");

        System.out.println("The word to check is: " + word);

        String reverseWord= reverseWord(word);

        System.out.println("The word that you introduce is Palindrome true(it's)/false(it's not): "+ checkPalindromeWord(word,reverseWord));



    }

    /**
     * Prompts the user with a message and returns the input string.
     *
     * @param Message The message to display to the user.
     * @return The string entered by the user.
     */
    public static String askString(String Message) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print(Message);
        return scannerObj.nextLine();
    }

    /**
     * Reverses a given word.
     *
     * @param word The word to be reversed.
     * @return The reversed word.
     */
    public static String reverseWord(String word) {

        // https://www.geeksforgeeks.org/reverse-a-string-in-java/

        StringBuilder createString = new StringBuilder();
        // append a string into StringBuilder input1
        createString.append(word);
        // reverse StringBuilder input1
        return String.valueOf(createString.reverse());

    }

    /**
     * Checks whether a word is a palindrome by comparing it with its reverse.
     *
     * @param word        The word to be checked.
     * @param reverseWord The reversed word for comparison.
     * @return True if the word is a palindrome, false otherwise.
     */
    public static boolean checkPalindromeWord(String word,String reverseWord){
        return word.equalsIgnoreCase(reverseWord);
    }
}