import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class FileManipulation {

    public static String[] getArrayOfTxt(File myObj) {

        List<String> listOfStrings = new ArrayList<>();

        Scanner myReader = null;


        String data = null;

        String[] array = null;

        try {

            myReader = new Scanner(myObj).useDelimiter("\\s+");

            while (myReader.hasNext()) {

                data = myReader.next();
                //System.out.println(data);
                data = data.replaceAll("[^a-zA-Z0-9]", " ");
                listOfStrings.add(data);

            }
            // convert any arraylist to array
            array = listOfStrings.toArray(new String[0]); // pass to Array

        } catch (
                FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } finally {
            myReader.close();
        }
        return array;
    }

    public static void printArray(String[] array) {
        for (String eachString : array) {
            System.out.println(eachString);
        }
    }

    public static Map<String, Long> countWords(String[] array) {
        List<String> wordsList = Arrays.asList(array); // pass to ArrayList

        Map<String, Long> wordCounts = wordsList.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        return wordCounts;
    }

    static void printWordsWithCountGreaterThanFive(Map<String, Long> wordCounts) {
        System.out.println("MOST FREQUENT WORDS ALONG WITH THEIR COUNTS:");
        wordCounts.forEach((word, count) -> {
            if (count > 5) {
                System.out.println(word + ": " + count);
            }
        });
    }

}
