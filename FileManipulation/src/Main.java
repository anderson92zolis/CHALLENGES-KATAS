import java.io.File;


public class Main {
    public static void main(String[] args) {

        File myObj = new File("phrasesCheck.txt");
        String[] array=  FileManipulation.getArrayOfTxt(myObj);
        //FileManipulation.printArray(array);
        FileManipulation.countWords(array);

        FileManipulation.printWordsWithCountGreaterThanFive(FileManipulation.countWords(array));


    }
}