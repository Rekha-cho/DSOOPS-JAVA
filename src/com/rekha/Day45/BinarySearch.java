package com.rekha.Day45;

public class BinarySearch {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("not found");
    }

}



