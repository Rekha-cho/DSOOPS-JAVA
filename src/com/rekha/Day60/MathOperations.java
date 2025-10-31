package com.rekha.Day60;

public class MathOperations {

    // Static methods for basic operations (overloaded)
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b; }
    public static float add(float a, float b) { return a + b; }

    public static int subtract(int a, int b) { return a - b; }
    public static double subtract(double a, double b) { return a - b; }

    public static int multiply(int a, int b) { return a * b; }
    public static double multiply(double a, double b) { return a * b; }

    public static int divide(int a, int b) { return a / b; }
    public static double divide(double a, double b) { return a / b; }

    // Instance methods for advanced operations
    public double square(double num) {
        return num * num;
    }

    public double cube(double num) {
        return num * num * num;
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        System.out.println("Addition (int): " + MathOperations.add(5, 10));
        System.out.println("Addition (double): " + MathOperations.add(2.5, 3.7));

        MathOperations math = new MathOperations();
        System.out.println("Square: " + math.square(4));
        System.out.println("Cube: " + math.cube(3));
    }
}
