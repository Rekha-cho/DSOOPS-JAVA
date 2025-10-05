package com.rekha.Day50;
public class StringBuild {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.insert(1,"ey");
        sb.delete(2,3);
        System.out.println(sb);
    }
}
