package com.rekha.Day44;

public class CountDown {
    public static void main(String args[]){
        int N = 10;
        countdown(N);
    }
    public static void countdown(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
}
