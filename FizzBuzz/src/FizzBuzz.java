/**
 * Generates a sequence of numbers from 1 to the given upper limit (inclusive) and replaces
 * certain numbers with "Fizz," "Buzz," or "FizzBuzz" based on their divisibility by 3, 5, or both.
 * The generated sequence is printed to the standard output.
 *
 * @int n the upper limit of the sequence to be evaluated
 */
public class FizzBuzz {
    public static void FizzBuzzProgram(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {

                System.out.println("Fizz");

            } else if (i % 5 == 0 ) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }

    }
}
