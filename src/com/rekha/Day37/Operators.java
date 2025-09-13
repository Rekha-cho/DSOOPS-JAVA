package com.rekha.Day37;

public class Operators {
        public static void main(String[] args) {
            // Assignment Operators
            int num = 50;
            System.out.println(num);
            num += 5;
            System.out.println(num);
            num -= 10;
            System.out.println(num);
            num *= 3;
            System.out.println(num);
            num /= 4;
            System.out.println(num);
            num %= 6;
            System.out.println(num);

            // Relational Operators
            int m = 15;
            int n = 15;
            if (m == n) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
            if (m != n) {
                System.out.println("Not Equal");
            } else {
                System.out.println("Equal");
            }
            if (m > n) {
                System.out.println("m is greater");
            } else {
                System.out.println("Not");
            }
            if (m < n) {
                System.out.println("n is greater");
            } else {
                System.out.println("Not");
            }
            if (m >= n) {
                System.out.println("m is greater or Equal");
            } else {
                System.out.println("NO");
            }
            if (m <= n) {
                System.out.println("n is greater or Equal");
            } else {
                System.out.println("NO");
            }

            // Logical Operators
            boolean a = false;
            boolean b = true;
            if (a && b) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            if (a || b) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            System.out.println("a = " + !a);
            System.out.println("b = " + !b);

            // Ternary Operator
            int value1 = 40, value2 = 22;
            int bigger = (value1 > value2) ? value1 : value2;
            System.out.println(bigger);
            String check = (value2 % 2 == 0) ? "Even" : "Odd";
            System.out.println(check);
        }
}
