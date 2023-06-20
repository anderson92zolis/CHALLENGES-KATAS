import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // creation of object
        ArrayManipulation arrayManipulation = new ArrayManipulation();
        // creation of Array
        int[] array = arrayManipulation.createRandonArray(11);

        // verify the length of array
        if (arrayManipulation.checkNotEmpty(array)) {
            System.out.println("Print the created Array: ");
            // print the created array
            arrayManipulation.printRandomArray(array);
            // array= new int[]{};
            // print the maximun number of the array
            System.out.println("The maximum number in the array is: " + arrayManipulation.findMaximunElement(array));
            System.out.println("reverse Array: ");
            arrayManipulation.printRandomArray(arrayManipulation.reverseArray(array));
            System.out.println("sum Array: " + arrayManipulation.sumArray(array));
            System.out.println("removed duplicates in  Array: ") ;
            arrayManipulation.printRandomArray(arrayManipulation.removeDuplicates(array));
            arrayManipulation.sortAsc(array);
            System.out.println("sorted ASC array: "+ Arrays.toString(array));
            System.out.println("sorted DSC array: "+ Arrays.toString(arrayManipulation.sortDCS(array)));
        }
    }
}