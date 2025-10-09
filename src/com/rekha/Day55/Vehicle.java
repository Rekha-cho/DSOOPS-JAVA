package com.rekha.Day55;

public class Vehicle {
    String brand;
    public Vehicle(String brand){
        this.brand=brand;
    }
//    @Override
//    public String toString(){
//        return "Vehicle100";
//    }

    public int hashcode(){
        return 100;
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle("BMW");
        System.out.println(v);
//        System.out.print(v.toString());
        System.out.print(v.hashcode());
    }
}