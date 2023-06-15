import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    /**
     * Test case for the FizzBuzzProgram method in the FizzBuzz class.
     * Verifies that the FizzBuzzProgram generates the expected output for a given upper limit.
     */

    @Test
    @DisplayName("Create test of a testFizzBuzz")
    public void testFizzBuzz() {

        /*

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Initializes a new instance of ByteArrayOutputStream, which is used to capture the output of the System.out.println() statements.
        The captured output will be stored in the outputStream object.

         */
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        /*
        System.setOut(new PrintStream(outputStream));

        Sets the standard output stream (System.out) to the outputStream object.
        This redirection allows us to capture the output that would typically be printed to the console.
         */

        System.setOut(new PrintStream(outputStream));

        /*
        Calls the FizzBuzzProgram method with the parameter 100.
        This executes the FizzBuzz logic for numbers from 1 to 100 and prints the output to the outputStream
         */

        FizzBuzz.FizzBuzzProgram(100);

        /*
        String[] output = outputStream.toString().split(System.lineSeparator());
        Converts the contents of outputStream to a string using toString().
        Splits the resulting string into an array of strings using System.lineSeparator() as the delimiter.
        This step separates each line of the captured output into individual elements of the output array.
         */

        String[] output = outputStream.toString().split(System.lineSeparator());

        // start the array [1,2,3,4....]
        assertEquals("1", output[0]);
        assertEquals("2", output[1]);
        assertEquals("Fizz", output[2]);
        assertEquals("4", output[3]);
        assertEquals("Buzz", output[4]);
        assertEquals("Fizz", output[5]);
        assertEquals("7", output[6]);
        assertEquals("8", output[7]);
        assertEquals("Fizz", output[8]);
        assertEquals("Buzz", output[9]);
        assertEquals("11", output[10]);
        assertEquals("Fizz", output[11]);
        assertEquals("13", output[12]);
        assertEquals("14", output[13]);
        assertEquals("FizzBuzz", output[14]);
        // ... Continue asserting the remaining output values
        assertEquals("Buzz", output[99]);
    }
}
