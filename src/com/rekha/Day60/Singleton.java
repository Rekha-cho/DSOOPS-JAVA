package com.rekha.Day60;

class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Instance");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Only once
        }
        return instance;
    }

    public void display() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();
    }
}