import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramDetector {

    public static void main(String[] args) {

        String word1 = askString("Enter a first word to check the Anagram: ");
        String word2 = askString("Enter a Second word to check the Anagram: ");


        System.out.println("The word to check is: " + word1 +" with "+ word2);

        System.out.println("The word that you introduce is Anagram true(it's)/false(it's not): "+ checkAnagramaWord(word1,word2));



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
     * Checks if two words are anagrams.
     *
     * @param word1 The first word to be checked.
     * @param word2 The second word to be checked.
     * @return {@code true} if the two words are anagrams, {@code false} otherwise.
     */
    public static boolean checkAnagramaWord(String word1,String word2){

        if(word1.length() != word2.length()){
            return false;
        }
        word1 = word1.toLowerCase();
        char charArray1[] = word1.toCharArray();
        Arrays.sort(charArray1);
        String string1 = new String(charArray1);


        word2 = word2.toLowerCase();
        char charArray2[] = word2.toCharArray();
        Arrays.sort(charArray2);
        String string2 = new String(charArray2);

        return string1.equals(string2);
    }
}