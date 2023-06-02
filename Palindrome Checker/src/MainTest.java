import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {


    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpInput() {
        // Set up test input
        String testInput = "Hello, World!";
        testIn = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(testIn);
    }

    @BeforeEach
    public void setUpOutput() {
        // Set up test output
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        // Restore system input and output
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testAskString() {
        // Define the expected result
        String expected = "Hello, World!";

        // Call the method under test
        String result = Main.askString("Enter a message:");

        // Assert the result
        assertEquals(expected, result);

    }

    @org.junit.jupiter.api.Test
    void reverseWord() {
        // Define the input and expected output
        String input = "Hello, World!";
        String expectedOutput = "!dlroW ,olleH";

        // Call the method under test
        String result = Main.reverseWord(input);

        // Assert the result
        assertEquals(expectedOutput, result);
    }

    @org.junit.jupiter.api.Test
    public void testCheckPalindromeWord_Palindrome() {
        // Define the input and expected output
        String word = "level";
        String reverseWord = "level";

        // Call the method under test
        boolean result = Main.checkPalindromeWord(word, reverseWord);

        // Assert the result
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testCheckPalindromeWord_NotPalindrome() {
        // Define the input and expected output
        String word = "hello";
        String reverseWord = "olleh";

        // Call the method under test
        boolean result = Main.checkPalindromeWord(word, reverseWord);

        // Assert the result
        assertFalse(result);
    }

}