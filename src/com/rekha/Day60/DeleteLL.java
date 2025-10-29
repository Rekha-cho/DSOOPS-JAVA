package com.rekha.Day60;

public class DeleteLL {
    private Node head; // Reference to the head node of the list
    private int size;  // To track the number of elements in the list

    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
        size--;
    }

    // ✅ Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        // If there is only one node
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        // Traverse to second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Remove last node
        secondLast.next = null;
        size--;
    }

    // Display all elements
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DeleteLL list = new DeleteLL();

        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(90);

        System.out.println("Initial List:");
        list.display();
        System.out.println("Size of the list: " + list.size());
        System.out.println();

        list.deleteFirst();
        System.out.println("After deleting first:");
        list.display();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.deleteLast();
        System.out.println("After deleting last:");
        list.display();
        System.out.println("Size: " + list.size());
    }
}
