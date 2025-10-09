package com.rekha.Day55;

public class CountDigits {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            Integer num = numbers[i];
            int value = Integer.valueOf(num);
            if (value % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
