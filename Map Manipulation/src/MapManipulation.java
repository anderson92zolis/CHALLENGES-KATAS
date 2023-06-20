import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/**
 * A class that provides methods for manipulating maps.
 */
public class MapManipulation {
    String[] array;
    Map<String, Integer> frecuencyElements;

    /**
     * Constructs a new instance of the MapManipulation class.
     */
    public MapManipulation(String[] array){
        this.array=array;
        this.frecuencyElements= countElementsInArray();
    };

    public Map<String, Integer> getFrecuencyElements() {
        return frecuencyElements;
    }

    /**
     * 12.1) Count the frequency of each element in an array using a map.
     * Counts the frequency of each element in an array using a map.
     *
     * @return a map containing the frequency of each element
     */
    public Map<String, Integer> countElementsInArray(){
        Map<String, Integer> frecuencyElements = new HashMap<>();
        Arrays.stream(array).forEach(animal -> frecuencyElements.put(String.valueOf(animal), frecuencyElements.getOrDefault(animal, 0 ) +1));
        return frecuencyElements;
    }

    /**
     * Prints the keys and values of the frequency elements map.
     */
    public void printMap(Map<String, Integer> map){
        // Print keys and values
        for (String i : map.keySet()) {
            System.out.println("Animal: " + i + ",\n\t numbers of repetitions: " + map.get(i));
        }
    }

    /**
     * Checks if the array contains elements.
     *
     * @return true if the array contains elements, false otherwise
     */
    public boolean testSizeArray(){
        boolean containElements= false;
        if(array.length >0 ){
            containElements= true;
        }
        return containElements;
    }

    /**
     * 12.2) Remove entries with a specific value from a map.
     * Deletes a key-value pair from the frequency elements map based on the specified value.
     *
     * @param value the value to be deleted from the map
     */
    public void deleteKey(String value){
        frecuencyElements.remove(value);
    }

    //12.3) Merge two maps and handle duplicate keys.

    public Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1,Map<String, Integer> map2 ){
        //https://stackoverflow.com/questions/50379529/merge-map-of-arrays-with-duplicate-keys
        Map<String, Integer> mergeTwoMaps = new HashMap<>();

        for (String i : map1.keySet()) {
            if (map2.containsKey(i)) {
                mergeTwoMaps.put(i, map2.get(i) + map1.get(i));
            }
        }
        return mergeTwoMaps;
    }

    // 12.4) Sort a map by values in ascending/descending order.

    public Map<String, Integer> sortValuesAsc(){

        Map<String, Integer> sortMap = new HashMap<>();

        for (String i : map1.keySet()) {
            if (map2.containsKey(i)) {
                mergeTwoMaps.put(i, map2.get(i) + map1.get(i));
            }
        }
        return sortMap;
    }




}
