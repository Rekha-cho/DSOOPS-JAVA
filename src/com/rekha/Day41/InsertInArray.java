package com.rekha.Day41;

import java.util.Arrays;
public class InsertInArray {
    public static  void main(String args[]){
        int [] arr={10,20,40,50,60,0};
        int n=5;
        int num=30;
        int pos=2;
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
        n++;
        System.out.println(Arrays.toString(arr));
    }
}
