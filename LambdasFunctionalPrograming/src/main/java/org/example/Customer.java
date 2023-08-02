package org.example;

public class Customer {
    private String name;
    private int age;
    private int points;

    public Customer(String name,int age ,int points) {
        this.name = name;
        this.age= age;
        this.points = points;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Name: "+name + "Age: " +age+ " Points: "+points;
    }
}
