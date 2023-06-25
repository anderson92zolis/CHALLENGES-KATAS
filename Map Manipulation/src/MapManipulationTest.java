import jdk.jfr.Label;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapManipulationTest {
    private String[] animalNames1;
    private MapManipulation frequencyMap;
    private Map<String, Integer> expectedMap1;

    private InputStream originalInput;
    private PrintStream originalOutput;
    private ByteArrayOutputStream outputStream;




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

        originalInput = System.in;
        originalOutput = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setIn(originalInput);
        System.setOut(originalOutput);
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
    @DisplayName("Merge Two HashMap")
    void mergeTwoMapsTest() {
        // create the expected HashMap
        Map<String, Integer> expectedMerge;
        expectedMerge= new HashMap<>();
        expectedMerge.put("cat", 6);
        expectedMerge.put("dog", 4);
        expectedMerge.put("elephant", 2);
        expectedMerge.put("lion", 2);

        // Call the method under test

        Map<String,Integer> realMergeMap= frequencyMap.mergeTwoMaps(frequencyMap.getFrecuencyElements(),frequencyMap.getFrecuencyElements() );

        // Assert the result
        assertEquals(expectedMerge,realMergeMap );
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Asc order")
    void sortValuesAsc() {
        // create the expected HashMap
        Map<String, Integer> sortAscExpected;
        sortAscExpected= new HashMap<>();

        sortAscExpected.put("elephant", 1);
        sortAscExpected.put("lion", 1);
        sortAscExpected.put("dog", 2);
        sortAscExpected.put("cat", 3);
        // Call the method under test

        Map<String,Integer> realAscMap= frequencyMap.sortValuesAsc();

        // Assert the result


    }

    @org.junit.jupiter.api.Test
    @DisplayName("Dsc order")
    void sortValuesDSC() {
        // create the expected HashMap
        Map<String, Integer> sortDscExpected;
        sortDscExpected= new HashMap<>();

        sortDscExpected.put("elephant", 1);
        sortDscExpected.put("lion", 1);
        sortDscExpected.put("dog", 2);
        sortDscExpected.put("cat", 3);
        // Call the method under test

        Map<String,Integer> realAscMap= frequencyMap.sortValuesDSC();

        // Assert the result
        assertEquals(sortDscExpected,realAscMap);
    }

    @org.junit.jupiter.api.Test
    void optionProgram() {

        String input = "1\nElephant\n2\nLion\n3\nTiger\n4\n0\n";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        frequencyMap.optionProgram();

        String expectedOutput = "\n 0 to leave \n 1 to add \n 2 remove \n 3 update \n 4 print\n\tEnter option example: " +
                "Enter a Animal name to add" +
                "Enter option example: " +
                "Enter a Animal name to remove" +
                "Enter option example: " +
                "Enter a Animal name to update" +
                "Enter option example: " +
                "Elephant: 1\nLion: 1\nTiger: 1\n" +
                "Enter option example: " +
                "Thanks for use the program!\n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("add animal")
    void addElementMap() {

        String animal = "Elephant";

        frequencyMap.addElementMap(animal);

        Assertions.assertEquals(1, frequencyMap.getFrecuencyElements().get(animal));



        animal = "Elephant";

        expectedMap1.put(animal, 2);

        frequencyMap.addElementMap(animal);

        Assertions.assertEquals(2, expectedMap1.get(animal));
    }

    @org.junit.jupiter.api.Test
    void updateKeyMap() {

        String animal = "Elephant";
        expectedMap1.put(animal, 2);

        String newAnimal = "Lion";
        frequencyMap.askWord = () -> newAnimal;

        yourClass.updateKeyMap(animal);

        Assertions.assertFalse(frecuencyElements.containsKey(animal));
        Assertions.assertTrue(frecuencyElements.containsKey(newAnimal));
        Assertions.assertEquals(1, frecuencyElements.get(newAnimal));
    }

    @org.junit.jupiter.api.Test
    void capitalizeFirstLetter() {
    }

    @org.junit.jupiter.api.Test
    void askWord() {
    }
}