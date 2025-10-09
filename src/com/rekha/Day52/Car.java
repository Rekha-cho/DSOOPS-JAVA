package com.rekha.Day52;

public class Car {
    public String make;
    public int year;
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "BMW";
        c.year = 2025;
        System.out.println(c.make);
        System.out.println(c.year);
    }
}
