package org.example;

public class Customer {
    private String name;
    private int points;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Name: "+name + " Points: "+points;
    }
}
