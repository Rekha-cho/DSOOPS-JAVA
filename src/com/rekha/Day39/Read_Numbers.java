package com.rekha.Day39;

import java.util.Scanner;
public class Read_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 5) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
        scanner.close();
    }
}
