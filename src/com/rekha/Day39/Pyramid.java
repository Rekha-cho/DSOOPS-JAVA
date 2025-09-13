package com.rekha.Day39;

public class Pyramid {
    public static void main(String[] args){
        int n = 10;
        int sum = 0, i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
