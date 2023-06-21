import jdk.jfr.Label;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapManipulationTest {
    String[] animalNames1;
    MapManipulation frequencyMap;
    Map<String, Integer> expectedMap1;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        animalNames1 = new String[]{
                "cat", "dog", "cat", "cat", "dog", "elephant","lion"
        };

        frequencyMap= new MapManipulation(animalNames1);

        // Expected
        expectedMap1 = new HashMap<>();
        expectedMap1.put("cat", 3);
        expectedMap1.put("dog", 2);
        expectedMap1.put("elephant", 1);
        expectedMap1.put("lion", 1);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    @DisplayName("FRECUENCY OF EACH ELEMENTS")
    void getFrecuencyElementsTest() {
        // Call the method under test
        Map<String, Integer> result = frequencyMap.getFrecuencyElements();
        // Assert the result
        Assertions.assertEquals(expectedMap1, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("COUNT ELEMENT")
    void countElementsInArrayTest() {

        // Call the method under test
        Map<String, Integer> result = frequencyMap.mapCountElementsInArray();

        // Assert the result
        Assertions.assertEquals(expectedMap1, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("PRINT MAP METHOD")
    void printMapTest() {

        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        frequencyMap.printMap(frequencyMap.getFrecuencyElements());

        // Restore System.out
        System.setOut(System.out);

        // Get the printed output
        String printedOutput = outputStream.toString();

        // Define the expected result
        String expectedOutput = "Animal: cat,\n\t numbers of repetitions: 3\n" +
                "Animal: dog,\n\t numbers of repetitions: 2\n" +
                "Animal: elephant,\n\t numbers of repetitions: 1\n"+
                "Animal: lion,\n\t numbers of repetitions: 1\n";

        // Assert the result
       assertEquals(expectedOutput.replaceAll("\\s+", ""), printedOutput.replaceAll("\\s+", ""));
       // https://stackoverflow.com/questions/29896838/how-to-ignore-the-white-spaces-while-compare-two-files
    }

    @org.junit.jupiter.api.Test
    @DisplayName("HAS ELEMENTS")
    void testSizeArraytTest() {

        // Call the method under test
        boolean actual= frequencyMap.testSizeArray();

        // Assert the result
        assertTrue(actual);

    }

    @org.junit.jupiter.api.Test
    @DisplayName("REMOVE ELEMENTS")
    void removeKeyMapTest() {
        expectedMap1.remove("elephant");
        // Call the method under test
        frequencyMap.removeKeyMap("elephant");
        Map<String, Integer> result = frequencyMap.getFrecuencyElements();
                // Assert the result
        assertEquals(expectedMap1, result);
    }




    
    @org.junit.jupiter.api.Test
    void mergeTwoMaps() {
    }

    @org.junit.jupiter.api.Test
    void sortValuesAsc() {
    }

    @org.junit.jupiter.api.Test
    void sortValuesDSC() {
    }

    @org.junit.jupiter.api.Test
    void optionProgram() {
    }

    @org.junit.jupiter.api.Test
    void addElementMap() {
    }

    @org.junit.jupiter.api.Test
    void updateKeyMap() {
    }

    @org.junit.jupiter.api.Test
    void capitalizeFirstLetter() {
    }

    @org.junit.jupiter.api.Test
    void askWord() {
    }
}