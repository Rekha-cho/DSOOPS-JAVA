package com.rekha.Day58;

public class Student {
    String name;
    int rollNumber;
    int marks;
    static int totalStudents = 0;

    Student(){
        totalStudents++;
    }
    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        totalStudents++;
    }

    String calculateGrade(){
        if (marks>90) return "A";
        else if (marks>=75) return "B";
        else if (marks>=50) return "C";
        else return "F";
    }
    public static void main(String[] args){
        Student s1 = new Student("A", 1, 90);
        Student s2 = new Student("b", 2, 94);
        Student s3 = new Student("c", 3, 96);

        System.out.println("Total Students: " + totalStudents);
        System.out.println(s1.name + " Marks: " + s1.marks + " Grade: " + s1.calculateGrade());
    }
}
