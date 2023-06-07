import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeNumberGenerator {

    public static void main(String[] args) {

        int number = askNumber("Enter a first numbers to check the numbers primes: ");

        System.out.println("List of primes numbers: " + listOfPrimeNumbers(number));


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

    /**
     * check all the possible prime numbers
     *
     * @param number All the possible numbers to be checked.
     * @return {@code ArrayList<Integer>} ArrayList<Integer> of all prime numbers
     */
    public static  ArrayList<Integer> listOfPrimeNumbers(int number) {

        ArrayList<Integer> primesNumber = new ArrayList<Integer>();

        int countPrimes = 0;

        if (number >= 1) {

            for(int bucleForInverseNumber=number; bucleForInverseNumber>=1; bucleForInverseNumber-- ) {

                for (int normalBucle = 1; normalBucle <= bucleForInverseNumber; normalBucle++) {
                    if (bucleForInverseNumber % normalBucle == 0) {
                        countPrimes++;
                    }
                }
                if (countPrimes == 2) {
                    primesNumber.add(bucleForInverseNumber);
                }
                countPrimes=0;
            }
        }

        // Sort ArrayList;

        Collections.sort(primesNumber);

        return primesNumber;
    }

}