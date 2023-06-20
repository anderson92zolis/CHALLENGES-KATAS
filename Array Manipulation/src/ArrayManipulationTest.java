import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

class ArrayManipulationTest {
    ArrayManipulation arrayManipulationObject;
    int[] arrayNumbers;

    @BeforeEach
    void setUp() {
        arrayManipulationObject = new ArrayManipulation();
        arrayNumbers = new int[]{1, 2, 3, 4, 5};
    }

    @AfterEach
    void tearDown() {
    }
    
    @Test
    @DisplayName("print random Array already created")
    void printRandomArray() {

            // Capture console output
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Test case: Non-empty array

            arrayManipulationObject.printRandomArray(arrayNumbers);

            // Convert console output to string
            String printedOutput = outputStream.toString().trim();

            // Verify printed output
            String[] outputLines = printedOutput.split(System.lineSeparator());
            Assertions.assertEquals(arrayNumbers.length, outputLines.length);
            for (int i = 0; i < arrayNumbers.length; i++) {
                Assertions.assertEquals(String.valueOf(arrayNumbers[i]), outputLines[i]);
            }

            // Test case: Empty array
            outputStream.reset();
            int[] array2 = {};
            arrayManipulationObject.printRandomArray(array2);
            printedOutput = outputStream.toString().trim();
            Assertions.assertEquals("", printedOutput);
    }

    @Test
    @DisplayName("create random array ")
    public void createRandomArrayTest() {

        // Test case 1: Positive number of elements
        int[] result1 = arrayManipulationObject.createRandonArray(5);
        Assertions.assertEquals(5, result1.length);

        Arrays.stream(result1)
                .forEach(element -> Assertions.assertTrue(element >= 0 && element <= 100));

        // Test case 2: Zero number of elements
        int[] result2 = arrayManipulationObject.createRandonArray(0);
        Assertions.assertEquals(0, result2.length);

        Arrays.stream(result2)
                .forEach(element -> Assertions.assertTrue(element >= 0 && element <= 100));

        // Test case 3: Negative number of elements
        int[] result3 = arrayManipulationObject.createRandonArray(11);
        Assertions.assertEquals(11, result3.length);

        Arrays.stream(result3)
                .forEach(element -> Assertions.assertTrue(element >= 0 && element <= 100));
    }

    @Test
    @DisplayName("find maximum value in the array")
    void findMaximumElementTest() {

        // Test case 1: Non-empty array

        int expected1 = 5;
        int actual1 = arrayManipulationObject.findMaximunElement(arrayNumbers);
        Assertions.assertEquals(expected1, actual1);

        // Test case 2: Empty array
        int[] array2 = {};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrayManipulationObject.findMaximunElement(array2);
        });
    }
    @Test
    @DisplayName("verify not empty array")
    void checkNotEmpty_WithNonEmptyArrayTest() {


        boolean result = arrayManipulationObject.checkNotEmpty(arrayNumbers);

        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("verify empty array")
    void CheckNotEmpty_WithEmptyArrayTest() {
        int[] arrayEmpty = {};
        boolean result = arrayManipulationObject.checkNotEmpty(arrayEmpty);

        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("reverse a array")
    void reverseArrayTest() {

        int[] expected = {5, 4, 3, 2, 1};
        int[] reversedArray = arrayManipulationObject.reverseArray(arrayNumbers);
        Assertions.assertArrayEquals(expected, reversedArray);
    }

    @Test
    @DisplayName("sum all the values of the array")
    void sumArrayTest() {

        int expectedSum = 15;
        int actualSum = arrayManipulationObject.sumArray(arrayNumbers);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("removeDuplicates method")
    public void testRemoveDuplicates() {
        int[] expectedOutput = {1, 2, 3, 4, 5};

        int[] actualOutput = arrayManipulationObject.removeDuplicates(arrayNumbers);

        Assertions.assertArrayEquals(expectedOutput, actualOutput, "Arrays should be equal");
    }

    @Test
    @DisplayName("findSecondLargest method")
    public void findSecondLargestTest() {

        int expectedSecondLargest = 4;

        int actualSecondLargest = arrayManipulationObject.findSecondLargest(arrayNumbers);

        Assertions.assertEquals(expectedSecondLargest, actualSecondLargest, "Second largest elements should be equal");
    }
    @Test
    @DisplayName("sort Array ASC")
    public void sortAscTest() {

        int[] expectedOutput = {1, 2, 3, 4, 5};

        // Call the method under test
        arrayManipulationObject.sortAsc(arrayNumbers);

        // Check if the array is sorted in ascending order
        Assertions.assertArrayEquals(expectedOutput, arrayNumbers);
    }

    @Test
    @DisplayName("sort Array DSC")
    public void sortDscTest() {
        int[] expectedOutput = {5, 4, 3, 2, 1};

        // Call the method under test
        int[] desArray= arrayManipulationObject.sortDCS(arrayNumbers);

        // Check if the array is sorted in ascending order
        Assertions.assertArrayEquals(expectedOutput, desArray);
    }
}