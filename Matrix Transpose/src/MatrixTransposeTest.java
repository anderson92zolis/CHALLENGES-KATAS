import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest {


    @org.junit.jupiter.api.Test
    void printMatriz() {
        // Prepare the input matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // Redirect the standard output to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the printMatriz method
        MatrixTranspose.printMatriz("Message", matrix);

        // Get the captured output
        String printedOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "Message\n1 2 3 \n4 5 6";

        // Assert that the printed output matches the expected output
        // xpectedOutput.replaceAll("\\s+","") to replace all the spaces
        //https://www.baeldung.com/java-compare-string-whitespace
        assertEquals(expectedOutput.replaceAll("\\s+",""), printedOutput.replaceAll("\\s+",""));

    }

    @org.junit.jupiter.api.Test
    void askNumberTest() {
        // Prepare the input stream with a predefined value
        String input = "42";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Call the askNumber method and capture the output
        int result = MatrixTranspose.askNumber("Enter a number: ");

        // Assert that the result matches the expected value
        assertEquals(42, result);

    }
}