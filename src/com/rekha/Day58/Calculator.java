package com.rekha.Day58;

public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Integer Addition: " + calc.add(10, 5));
        System.out.println("Double Addition: " + calc.add(3.5, 4.2));
        System.out.println("Three Number Addition: " + calc.add(5, 6, 7));
        System.out.println("String Concatenation: " + calc.add("Hello", "World"));
    }

}
