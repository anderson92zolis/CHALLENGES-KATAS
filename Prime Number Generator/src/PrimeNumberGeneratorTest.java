import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberGeneratorTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    /**
     * Test case for the listOfPrimeNumbers method in the PrimeNumberGenerator class.
     * Verifies the correctness of the generated list of prime numbers for different inputs.
     */
    @org.junit.jupiter.api.Test
    @DisplayName("List of a PrimeNumbers")
    void listOfPrimeNumbers() {
        //  Test case: numberOne input
        int number= 1;
        ArrayList<Integer> expectedArrayList = new ArrayList<>();

        ArrayList<Integer> result= PrimeNumberGenerator.listOfPrimeNumbers(1);
        Assertions.assertEquals(expectedArrayList,result);

        //  Test case 1: Positive input
        int number1= 5;

        expectedArrayList.add(2);
        expectedArrayList.add(3);
        expectedArrayList.add(5);

        ArrayList<Integer> result1= PrimeNumberGenerator.listOfPrimeNumbers(5);
        Assertions.assertEquals(expectedArrayList,result1);

        //  Test case 2: Positive input
        int number2= 14;

        expectedArrayList.add(7);
        expectedArrayList.add(11);
        expectedArrayList.add(13);

        ArrayList<Integer> result2= PrimeNumberGenerator.listOfPrimeNumbers(14);
        Assertions.assertEquals(expectedArrayList,result2);

        int number3= 20;

        expectedArrayList.add(17);
        expectedArrayList.add(19);


        ArrayList<Integer> result3= PrimeNumberGenerator.listOfPrimeNumbers(20);
        Assertions.assertEquals(expectedArrayList,result3);


    }
}