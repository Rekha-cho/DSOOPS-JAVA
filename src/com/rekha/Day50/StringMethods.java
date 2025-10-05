package com.rekha.Day50;
import java.util.Arrays;
public class StringMethods {
    public static void main(String args[]){
//        char arr[]={'R','E','K','H','A'};
        String arr="Rekha";
        System.out.println(arr.length());
        System.out.println(arr.charAt(2));
        System.out.println(arr.substring(2,4));
        System.out.println(arr.indexOf('k'));
        System.out.println(arr.equals("Rupali"));
        System.out.println(arr.equalsIgnoreCase("ReKHa"));
        System.out.println(arr.concat("Chopra"));
        System.out.println("REKHA".toLowerCase());
        System.out.println(arr.toUpperCase());
        System.out.println(arr.replace('a','u'));
//


        String[] parts = "rekha".split(",");
        System.out.println(Arrays.toString(parts));

        System.out.println("----------------------");

        StringBuffer str=new StringBuffer();
        System.out.println(str.capacity());

       StringBuffer sb=new StringBuffer("UNI");
        System.out.println(sb.append("VERSITY"));
        System.out.println(sb.insert(0,"CHITKARA "));
        System.out.println(sb.delete(0,3));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.indexOf("i"));
        System.out.println(sb.lastIndexOf("i"));
        System.out.println(sb.substring(4));
        System.out.println(sb.substring(0,4));
        System.out.println(sb);
        System.out.println(sb.replace(0,3,"ABC"));

    }
}
