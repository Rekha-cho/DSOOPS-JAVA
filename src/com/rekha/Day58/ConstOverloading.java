package com.rekha.Day58;

public class ConstOverloading {
    int age;
    String name;

    ConstOverloading() {
        System.out.println("This is a default constructor.");
    }

    ConstOverloading(String n) {
        name = n;
        System.out.println("Name: " + name);
    }

    ConstOverloading(String n, int a) {
        name = n;
        age = a;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstOverloading p1 = new ConstOverloading();
        ConstOverloading p2 = new ConstOverloading("Rekha");
        ConstOverloading p3 = new ConstOverloading("Rekha", 25);
    }
}
