package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("14) Filter a list of objects based on a specific condition using lambdas.");
        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);


        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

        List<Customer> filterCustomers = customers
            .stream()
                    .filter(c-> c.getPoints() > 100 || c.getName().startsWith("S")).collect(Collectors.toList());

        System.out.println(filterCustomers);

        }

}