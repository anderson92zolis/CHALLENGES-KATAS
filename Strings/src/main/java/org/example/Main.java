package org.example;

/**
 * Demonstrates the usage of the {@code ReverseStringClass}.
 *
 */
public class Main {

    public static void main(String[] args) {
        String input = "Hello, world!";
        ReverseWord create= new ReverseWord(input);
        String reversedWord = create.reverseString();

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedWord);
    }

}