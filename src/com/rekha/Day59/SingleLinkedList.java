package com.rekha.Day59;

public class SingleLinkedList {
    private Node head; // Reference to the head node of the list
    private int size; // To track the number of elements in the list

    // Inner Node class to represent elements of the list
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++; // Increment size whenever a ndde is created
        }
    }
    public void addFirst(int data)
    {
        Node node =new Node(data);
        node.next=head;
        head=node;
    }
    // Add a node to the beginning of the list
    public void addLast(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }
        Node current=head;
        while(current.next != null)
        {
            current=current.next;
        }

    }
    // Insert a node at a specific position (1-based index)

    public void insertAtPosition(int data, int position)
    {
        if(position<=0|| position >size+1)
        {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode= new Node(data);
        if(position ==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node current =head;
        for(int i=1;i<position-1 && current!=null;i++)
        {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public int size()
    {
        return size;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(90);
        System.out.println("Initial List:");
        list.display();

        list.insertAtPosition(54,2);
        System.out.println("After inserting 54 at position 2:");
        list.display();

        list.addLast(100);
        System.out.println("After adding 100 at the end: ");
        list.display();

        System.out.println("Size of the list: "+ list.size());
    }

}
