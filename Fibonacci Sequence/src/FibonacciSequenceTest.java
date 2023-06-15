import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    /**
     * Test case for verifying the FibonacciSequence of a given number in the FibonacciSequence class.
     */
    @org.junit.jupiter.api.Test
    @DisplayName("Verify FibonacciSequence of a given number")
    void listOfFinonacciSeqTest() {

        ArrayList<Integer> expectedArray= new ArrayList<>();

        // TEST1
        int number= 10;
        expectedArray.add(1);
        expectedArray.add(1);
        expectedArray.add(2);
        expectedArray.add(3);
        expectedArray.add(5);
        expectedArray.add(8);

        Assertions.assertEquals(expectedArray,FibonacciSequence.listOfFinonacciSeq(number));

        // TEST 2
        number= 30;
        expectedArray.add(13);
        expectedArray.add(21);
        Assertions.assertEquals(expectedArray,FibonacciSequence.listOfFinonacciSeq(number));

        // TEST 3
        number= 100;
        expectedArray.add(34);
        expectedArray.add(55);
        expectedArray.add(89);
        Assertions.assertEquals(expectedArray,FibonacciSequence.listOfFinonacciSeq(number));

    }
}