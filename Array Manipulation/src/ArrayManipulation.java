import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayManipulation {



    /**
     * Generates an array of random integers.
     *
     * @param numbersElements The number of elements in the array.
     * @return An array of random integers.
     */
    public int[] createRandonArray(int numbersElements) {


        if (numbersElements > 0) {

            Random random = new Random();

            int[] array = new int[numbersElements];

            Arrays.setAll(array, i -> random.nextInt(101));

            return array;
        }


        return new int[0];
    }

    /**
     * Prints the elements of an array.
     *
     * @param arrayToPrint The array to be printed.
     */
    public void printRandomArray(int[] arrayToPrint) {
        Arrays.stream(arrayToPrint).forEach(System.out::println);
    }

    /**
     * Finds the maximum element in the given integer array.
     *
     * @param array The integer array from which to find the maximum element.
     * @return The maximum element in the array.
     * @throws IllegalArgumentException If the array is empty.
     */
    public int findMaximunElement(int[] array) {
        int maximunElement = 0;
        maximunElement = Arrays.stream(array).max().orElseThrow(() -> new IllegalArgumentException("The array is empty .")); // this exception is not necessary because we have a created methode to check the length for an Array
        return maximunElement;
    }

    /**
     * Checks if the given integer array is not empty.
     *
     * @param array The integer array to check for emptiness.
     * @return {@code true} if the array is not empty, {@code false} otherwise.
     */
    public boolean checkNotEmpty(int[] array) {
        boolean checkNotEmpty = true;
        if (array.length != 0) {
            System.out.println("Oh yeaaa! The Array has vales! ");
        } else {
            System.out.println("pufffff! The Array in empty! ");
            checkNotEmpty = false;
        }

        return checkNotEmpty;
    }

    /**
     * Reverses the given integer array by creating a new array with reversed elements.
     *
     * @param array The integer array to be reversed.
     * @return A new array with reversed elements.
     */
    public int[] reverseArray(int[] array) {
        return IntStream.range(0, array.length)
                .map(i -> array[array.length - i - 1])
                .toArray();
    }

    /**
     * The method calculates the sum of all elements in the given integer array.
     * The @param tag documents the parameter array, indicating that it is the input integer array for which the sum will be calculated.
     * The @return tag describes the return value of the method, specifying that it returns the sum of all elements in the array.
     */
    public int sumArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    /**
     * Removes duplicate elements from an integer array.
     *
     * @param array the array from which duplicate elements need to be removed
     * @return an array containing only the unique elements from the input array
     */
    public int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    /**
     * Finds the second largest element in an integer array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     * @throws IllegalArgumentException if the array does not have a second largest element
     */
    public  int findSecondLargest(int[] array) {
        /*
        distinct(): Esta operación elimina cualquier elemento duplicado en el flujo. Garantiza que solo haya valores únicos en el flujo.
        boxed(): Esta operación convierte el flujo de elementos primitivos en un flujo de elementos envueltos (Stream<Integer> en lugar de IntStream). Esto es necesario para poder aplicar la operación sorted() en el paso siguiente, ya que sorted() no se puede aplicar directamente a un IntStream.
        sorted((a, b) -> b - a): Esta operación ordena los elementos en orden descendente utilizando una expresión lambda como criterio de ordenamiento. La expresión (a, b) -> b - a indica que se debe comparar b con a y obtener la diferencia entre ellos para el ordenamiento descendente.
        limit(2): Esta operación limita el flujo a los primeros dos elementos después de la ordenación. Esto asegura que solo se consideren los dos elementos más grandes en el flujo.
        skip(1): Esta operación omite el primer elemento en el flujo después de la limitación. Esto se hace para obtener el segundo elemento más grande en el flujo.
        findFirst(): Esta operación encuentra el primer elemento en el flujo después de las operaciones anteriores. En este caso, el primer elemento será el segundo elemento más grande en el flujo.
        orElseThrow(() -> new IllegalArgumentException("Array does not have a second largest element.")): Esta operación devuelve el valor encontrado por findFirst(). Si no se encuentra ningún elemento, lanza una excepción IllegalArgumentException con el mensaje especificado.
         */

        return Arrays.stream(array)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(2)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have a second largest element."));
    }

    /**
     * Sorts an array of integers in ascending order.
     *
     * @param array the array of integers to be sorted
     */
    public void sortAsc(int[] array) {
        // https://stackoverflow.com/questions/54126952/how-to-sort-integer-array-in-ascending-and-descending-order-using-lambda-only-in
        Arrays.sort(array);
    }

    /**
     * Sorts an array of integers in descending order.
     *
     * @param array the array of integers to be sorted
     * @return a new array containing the sorted integers in descending order
     */
    public int[] sortDCS(int[] array) {
        // https://stackoverflow.com/questions/54126952/how-to-sort-integer-array-in-ascending-and-descending-order-using-lambda-only-in
        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
