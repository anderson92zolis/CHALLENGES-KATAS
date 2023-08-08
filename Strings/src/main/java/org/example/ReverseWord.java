package org.example;


// https://www.geeksforgeeks.org/reverse-a-string-in-java/

/**
 * The {@code ReverseStringClass} class encapsulates the functionality to reverse a given string.
 * It provides methods to initialize the class with an input string and reverse it.
 *
 * <p>This class is designed to enhance code readability and reusability by offering a structured
 * approach to reversing strings.</p>
 *
 * @since 1.0
 */
public class ReverseWord {

    private String myString;


    public ReverseWord(String myString) {
        this.myString=myString;
    }


    public String reverseString(){
        StringBuilder input1 = new StringBuilder();
        input1.append(myString);
        input1.reverse();
        return input1.toString();

    }
}
