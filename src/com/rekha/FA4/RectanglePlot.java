package com.rekha.FA4;

public class RectanglePlot {
    double length;
    double breadth;
    double cost;
    public RectanglePlot(double length, double breadth, double cost) {
        this.length = length;
        this.breadth = breadth;
        this.cost = cost;
    }
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
    public double fence() {
        return perimeter() * cost;
    }
    public void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Total fencing cost: " + fence());
    }
}
