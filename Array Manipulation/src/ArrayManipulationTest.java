import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

class ArrayManipulationTest {
    ArrayManipulation arrayManipulationObject;

    @BeforeEach
    void setUp() {
        arrayManipulationObject = new ArrayManipulation();
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
            int[] array1 = {1, 2, 3, 4, 5};
            arrayManipulationObject.printRandomArray(array1);

            // Convert console output to string
            String printedOutput = outputStream.toString().trim();

            // Verify printed output
            String[] outputLines = printedOutput.split(System.lineSeparator());
            Assertions.assertEquals(array1.length, outputLines.length);
            for (int i = 0; i < array1.length; i++) {
                Assertions.assertEquals(String.valueOf(array1[i]), outputLines[i]);
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
    public void CreateRandomArrayTest() {

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
    void FindMaximumElementTest() {

        // Test case 1: Non-empty array
        int[] array1 = {2, 5, 1, 9, 4};
        int expected1 = 9;
        int actual1 = arrayManipulationObject.findMaximunElement(array1);
        Assertions.assertEquals(expected1, actual1);

        // Test case 2: Empty array
        int[] array2 = {};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrayManipulationObject.findMaximunElement(array2);
        });
    }
    @Test
    @DisplayName("verify not empty array")
    void testCheckNotEmpty_WithNonEmptyArray() {
        int[] arrayWithValue = {1, 2, 3, 4, 5};

        boolean result = arrayManipulationObject.checkNotEmpty(arrayWithValue);

        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("verify empty array")
    void testCheckNotEmpty_WithEmptyArray() {
        int[] arrayEmpty = {};
        boolean result = arrayManipulationObject.checkNotEmpty(arrayEmpty);

        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("reverse a array")
    void testReverseArray() {
        int[] arrayNumbers = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] reversedArray = arrayManipulationObject.reverseArray(arrayNumbers);
        Assertions.assertArrayEquals(expected, reversedArray);
    }

    @Test
    @DisplayName("sum all the values of the array")
    void testSumArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = arrayManipulationObject.sumArray(array);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Test removeDuplicates method")
    public void testRemoveDuplicates() {
        int[] input = {1, 2, 3, 4, 2, 3, 5};
        int[] expectedOutput = {1, 2, 3, 4, 5};

        int[] actualOutput = arrayManipulationObject.removeDuplicates(input);

        Assertions.assertArrayEquals(expectedOutput, actualOutput, "Arrays should be equal");
    }

    @Test
    @DisplayName("Test findSecondLargest method")
    public void testFindSecondLargest() {
        int[] array = {5, 2, 7, 3, 9, 8};
        int expectedSecondLargest = 8;

        int actualSecondLargest = arrayManipulationObject.findSecondLargest(array);

        Assertions.assertEquals(expectedSecondLargest, actualSecondLargest, "Second largest elements should be equal");
    }
}