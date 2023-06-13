
public class Main {
    public static void main(String[] args) {

        int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };
        SortingAlgorithms.bubbleSort(arr1);
        System.out.println("Sorted array by BubbleSort: ");
        SortingAlgorithms.printArray(arr1);

        int arr2[] = { 92, 3, 32, 45, 22, 17, 31 };
        SortingAlgorithms.insertionSort(arr2);
        System.out.println("Sorted array by InsertionSort: ");
        SortingAlgorithms.printArray(arr2);


    }


}