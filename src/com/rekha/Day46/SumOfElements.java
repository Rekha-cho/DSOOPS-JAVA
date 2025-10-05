package com.rekha.Day46;

public class SumOfElements {
    public static int Sum(int arr[]) {
        int sum=0;

        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,545,6,8,9};
        System.out.println(Sum(arr));
    }
}