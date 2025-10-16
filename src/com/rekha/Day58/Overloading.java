package com.rekha.Day58;

public class Overloading {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}


