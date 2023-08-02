package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("14.1) Filter a list of objects based on a specific condition using lambdas.");
        Customer john = new Customer("John P.", 35,50);
        Customer sarah = new Customer("Sarah M.", 18,200);
        Customer charles = new Customer("Charles B.", 32,150);
        Customer mary = new Customer("Mary T.", 45,1);


        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

        List<Customer> filterCustomers = customers
            .stream()
                    .filter(c-> c.getPoints() > 100 || c.getName().startsWith("S")).collect(Collectors.toList());

        System.out.println(filterCustomers);

        System.out.println("14.2) Map elements of a list to a new list using a lambda expression.");

        List<String> ListByNames= customers
                .stream()
                .map(c->c.getName())
                .collect(Collectors.toList());

        System.out.println(ListByNames);

        System.out.println("14.3) Perform operations such as sum, average, or maximum on a list using streams and lambdas.");

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
    }
}