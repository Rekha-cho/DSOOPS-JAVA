package com.rekha.Day44;

public class Sum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        int N = 10; // Example
        System.out.println("Sum from 1 to " + N + " = " + sum(N));
    }
}
