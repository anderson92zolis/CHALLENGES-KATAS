import java.util.*;
import java.util.stream.Collectors;


/**
 * A class that provides methods for manipulating maps.
 */
public class MapManipulation {
    private String[] array;
    private Map<String, Integer> frecuencyElements;
    private Scanner myObjScanner;

    /**
     * Constructs a new instance of the MapManipulation class.
     */
    public MapManipulation(String[] array) {
        this.array = array;
        this.frecuencyElements = mapCountElementsInArray();
        this.myObjScanner = new Scanner(System.in);
    }


    /**
     * Returns the frequency elements map.
     *
     * @return The map containing the frequency elements, where the keys are animal names
     *         and the values are their corresponding frequencies.
     */
    public Map<String, Integer> getFrecuencyElements() {
        return frecuencyElements;
    }

    /**
     * 12.1) Count the frequency of each element in an array using a map.
     * Counts the frequency of each element in an array using a map.
     *
     * @return a map containing the frequency of each element
     */
    public Map<String, Integer> mapCountElementsInArray() {
        Map<String, Integer> frecuencyElements = new HashMap<>();
        Arrays.stream(array).forEach(animal -> frecuencyElements.put(String.valueOf(animal), frecuencyElements.getOrDefault(animal, 0) + 1));
        return frecuencyElements;
    }

    /**
     * Prints the keys and values of the frequency elements map.
     */
    public void printMap(Map<String, Integer> map) {
        // Print keys and values
        /*
        for (String i : map.keySet()) {
            System.out.println("Animal: " + i + ",\n\t numbers of repetitions: " + map.get(i));
        }

         */

        map.forEach((key,value)->System.out.println("Animal: " + key + ",\n\t numbers of repetitions: " + value));
    }

    /**
     * Checks if the array contains elements.
     *
     * @return true if the array contains elements, false otherwise
     */
    public boolean testSizeArray() {
        boolean containElements = false;
        if (array.length > 0) {
            containElements = true;
        }
        return containElements;
    }


    /**
     * 12.2) Remove entries with a specific value from a map.
     * Removes an animal key from the frequency elements map.
     *
     * @param animal The name of the animal to be removed.
     */

    public void removeKeyMap(String animal) {
        if (frecuencyElements.containsKey(animal)) {
            frecuencyElements.remove(animal);
        } else {
            System.out.print("Animal doesn't exists!");
        }
    }

    /**
     * 12.3) Merge two maps and handle duplicate keys.
     * Merges two maps of animal names and their corresponding frequencies into a single map.
     * The frequencies for common animal names are summed together.
     *
     * @param map1 The first map of animal names and frequencies.
     * @param map2 The second map of animal names and frequencies.
     * @return A new map containing the merged frequencies of common animal names from both input maps.
     */
    public Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        //https://stackoverflow.com/questions/50379529/merge-map-of-arrays-with-duplicate-keys
        Map<String, Integer> mergeTwoMaps = new HashMap<>();

        for (String i : map1.keySet()) {
            if (map2.containsKey(i)) {
                mergeTwoMaps.put(i, map2.get(i) + map1.get(i));
            }
        }
        return mergeTwoMaps;
    }



    /**
     * 12.4) Sort a map by values in ascending/descending order.
     * Sorts the frequency elements map in ascending order based on the values.
     *
     * @return A new map with the frequency elements sorted in ascending order by their values.
     */
    public Map<String, Integer> sortValuesAsc() {

        //  https://www.scaler.com/topics/sort-map-by-value-in-java/
        //  https://www.baeldung.com/java-hashmap-sort

        Map<String, Integer> sortMapAsc = frecuencyElements
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        return sortMapAsc;
    }

    /**
     * 12.4) Sort a map by values in ascending/descending order.
     * Sorts the frequency elements map in descending order based on the values.
     *
     * @return A new map with the frequency elements sorted in descending order by their values.
     */
    public Map<String, Integer> sortValuesDSC() {
        // https://www.baeldung.com/java-hashmap-sort

        Map<String, Integer> sortMapDsc = frecuencyElements
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        return sortMapDsc;
    }

    /**
     * 12.5) Perform various operations (add, remove, update) on a map.
     * Runs the program and presents options to the user.
     * The user can add, remove, update, or print the frequency map.
     */
    public void optionProgram() {
        String userName = null;
        do {
            userName = askWord("\n 0 to leave \n 1 to add \n 2 remove \n 3 update \n 4 print\n\tEnter option example: ");  // Read user input
            switch (userName) {

                case "0":
                    System.out.println("Thanks for use the program!");
                    break;
                case "1":
                    addElementMap(askWord("Enter a Animal name to add"));
                    break;
                case "2":
                    removeKeyMap(askWord("Enter a Animal name to remove"));
                    break;
                case "3":
                    updateKeyMap(askWord("Enter a Animal name to update"));
                    break;
                case "4":
                    printMap(frecuencyElements);
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }
        } while (!userName.equals("0"));
    }

    /**
     * Adds an element to the map and updates its frequency.
     *
     * @param animal the element to add to the map
     */
    public void addElementMap(String animal) {
        //stackoverflow.com/questions/4157972/how-to-update-a-value-given-a-key-in-a-hashmap
        if (frecuencyElements.containsKey(animal)) {
            frecuencyElements.put(animal, frecuencyElements.get(animal) + 1);
        } else {
            frecuencyElements.put(animal, 1);
        }

    }


    /**
     * Updates the key in the map by replacing it with a new key and updating its frequency.
     *
     * @param animal the animal key to update in the map
     */
    public void updateKeyMap(String animal) {

        if (frecuencyElements.containsKey(animal)) {
            removeKeyMap(animal);
            String newAnimal = askWord("Enter a new Animal name to update");
            if (frecuencyElements.get(newAnimal) == null) {
                frecuencyElements.put(newAnimal, 1);
            } else {
                frecuencyElements.put(newAnimal, frecuencyElements.get(newAnimal) + 1);
            }
        }
    }


    /**
     * Capitalizes the first letter of a given string.
     *
     * @param letter the string to capitalize the first letter of
     * @return the string with the first letter capitalized
     */
    public String capitalizeFirstLetter(String letter){
        String cap = letter.substring(0, 1).toUpperCase() + letter.substring(1);
        return cap;
    }

    /**
     * Displays a message to the user and reads a word as input.
     * The first letter of the input word is capitalized.
     *
     * @param message the message to display to the user
     * @return the user's input word with the first letter capitalized
     */
    public String askWord(String message) {

        System.out.println(message);
        String userName = capitalizeFirstLetter(myObjScanner.nextLine());  // Read user input
        return userName;
    }

}
