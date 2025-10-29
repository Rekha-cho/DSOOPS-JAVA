package com.rekha.Day60;

public class Employee {
    private int id;
    private String name;
    private double salary;
    static String companyName = "TechSoft";

    // Default constructor
    public Employee() {
        this(0, "Unknown", 0.0);
    }

    // Constructor with id and name
    public Employee(int id, String name) {
        this(id, name, 0.0);
    }

    // Constructor with all details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Overloaded calculateBonus methods
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    public double calculateBonus(double percentage) {
        return salary * (percentage / 100);
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Rekha", 50000);

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        System.out.println("Bonus (default 10%): " + e2.calculateBonus());
        System.out.println("Bonus (20%): " + e2.calculateBonus(20));
    }
}
