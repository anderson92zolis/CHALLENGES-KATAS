public class SortingAlgorithms {

    static void bubbleSort(int[] array) {
        int temp;
        int lengthArray = array.length;
        boolean swapped;
        for (int i = 0; i < lengthArray - 1; i++) {

            swapped = false;

            for (int j = 0; j < lengthArray - i - 1; ++j) {

                if (array[j] > array[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


        // Function to print an array
        static void printArray ( int arr[]){
            int i;
            for (i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
