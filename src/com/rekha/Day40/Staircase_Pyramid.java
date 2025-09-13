package com.rekha.Day40;

public class Staircase_Pyramid {
    public static void main(String[] args){
        String name="REKHA";
        int len=name.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                char ch=name.charAt(j);
                System.out.print(ch);
            }
            System.out.println( );
        }
    }
}
