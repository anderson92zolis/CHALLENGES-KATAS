import java.util.Scanner;

/**
 * what is Matrix transpose https://es.wikipedia.org/wiki/Matriz_transpuesta
 * for this project two-dimensional array.
 */
public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = createMatriz();

        printMatriz("Generating the new Matrix" ,matrix );
        printMatriz("Matrix transpose" ,transposeMatriz(matrix) );




    }

    /**
     * Creates a two-dimensional matrix based on user input.
     *
     * @return The created matrix as a two-dimensional array.
     */
    public static int[][] createMatriz(){

        System.out.println("\nEnter a Matrix M*M where m are the row and n the column TWO-DIMENSIONAL ARRAY. ");


        int rows = askNumber("\tEnter length of rows!  m : ");
        int columns = askNumber("\tEnter length of  column!  n : ");

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = askNumber("Enter the  value for the matrix [rows][columns][" + i +"][" + j + "]: ");
            }
        }
        return matrix;
    }

    /**
     * Transposes a given matrix by interchanging its rows with columns.
     *
     * @param matrix The input matrix to be transposed.
     * @return The transposed matrix as a new two-dimensional array.
     */
    public static int[][] transposeMatriz(int[][] matrix) {

        int [][] transMatriz= new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                transMatriz[j][i]= matrix[i][j];
            }
            System.out.println();
        }
        return transMatriz;
    }



    /**
     * Prints the given matrix to the console.
     *
     * @param Message The message to be displayed before printing the matrix.
     * @param matrix The matrix to be printed.
     */
    public static void printMatriz(String Message, int[][] matrix) {

        System.out.println(Message);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Prompts the user with a message and returns the input int.
     *
     * @param Message The message to display to the user.
     * @return The int entered by the user.
     */
    public static int askNumber(String Message) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print(Message);

        return scannerObj.nextInt();
    }
}