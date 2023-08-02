package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("\n"+"14.1) Filter a list of objects based on a specific condition using lambdas.");
        Customer john = new Customer("John P.", 35,50);
        Customer sarah = new Customer("Sarah M.", 18,200);
        Customer charles = new Customer("Charles B.", 32,150);
        Customer mary = new Customer("Mary T.", 45,1);


        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

        List<Customer> filterCustomers = customers
            .stream()
                    .filter(c-> c.getPoints() > 100 || c.getName().startsWith("S")).collect(Collectors.toList());

        System.out.println(filterCustomers);

        System.out.println("\n"+"14.2) Map elements of a list to a new list using a lambda expression.");

        List<String> ListByNames= customers
                .stream()
                .map(c->c.getName())
                .collect(Collectors.toList());

        System.out.println(ListByNames);

        System.out.println("\n"+" 14.3) Perform operations such as sum, average, or maximum on a list using streams and lambdas.");

        Integer sum = customers
                .stream()
                .map(c->c.getPoints())
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println("The sum is of point are: "+sum);

        double average = customers
                .stream()
                .mapToInt((a) -> a.getAge())
                .average().orElse(0);

        System.out.println("The average of ages are: "+average);

        double maximun = customers
                .stream()
                .mapToInt(a -> a.getAge())
                .max().orElse(0);

        System.out.println("The maximum of ages are: "+maximun);

        System.out.println("\n"+" 14.4) Sort a list of objects based on a specific property using a lambda comparator.");
        // https://www.geeksforgeeks.org/java-lambda-expression-with-collections/
        Collections.sort(customers, (o1, o2) -> (o1.getAge() > o2.getAge()) ? 1 :
                (o1.getAge() < o2.getAge()) ? -1 : 0);

        System.out.println("Elements of the Customer List after sorting by Age: " + customers);

        System.out.println("\n"+"14,5) Implement functional interfaces and use them in lambda expressions.");
        //https://www.geeksforgeeks.org/functional-interfaces-java/

        // lambda expression to define the calculate method
        SquareOfPoints sPoints =(double x )-> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        double sPointsOfMaxumun = sPoints.square(
                average = customers
                .stream()
                .mapToInt(a -> a.getAge())
                .max().orElse(0)  );

        System.out.println("maximun point to square: " +sPointsOfMaxumun );

    }
}