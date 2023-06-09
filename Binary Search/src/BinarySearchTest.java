import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void create50RandonNumbersInArray() {

        int[] result = BinarySearch.create50RandonNumbersInArray();

        // Check the length of the resulting array
        assertEquals(50, result.length);

        // Check that each element is within the range of 0 to 100
        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] >= 0 && result[i] <= 100);
        }

    }

    @org.junit.jupiter.api.Test
    void printMatriz() {

        int[] matrix = {1, 2, 3, 4, 5};
        String expectedOutput = "Matrix:\n1,   2,   3,   4,   5,   ";

        // Redirect console output for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method to be tested
        BinarySearch.printMatriz("Matrix:" , matrix);

        // Restore standard output
        System.setOut(System.out);

        // Check the printed output
        assertEquals(expectedOutput.replaceAll("\\s+",""), outputStream.toString().replaceAll("\\s+",""));


    }

    @org.junit.jupiter.api.Test
    void askNumber() {
        // Prepare the input stream with a predefined value
        String input = "42";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Call the askNumber method and capture the output
        int result = BinarySearch.askNumber("Enter a number: ");

        // Assert that the result matches the expected value
        assertEquals(42, result);
    }
}