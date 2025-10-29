package com.rekha.Day60;

public class DeletionInSingleLinkedList {
    private DeletionInSingleLinkedList.Node head; // Reference to the head node of the list
    private int size; // To track the number of elements in the list

    // Inner Node class to represent elements of the list
    class Node {
        int data; // Data stored in the node
        DeletionInSingleLinkedList.Node next; // Reference to the next node

        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++; // Increment size whenever a node is created
        }
    }
    public void addFirst(int data)
    {
        DeletionInSingleLinkedList.Node node =new DeletionInSingleLinkedList.Node(data);
        node.next=head;
        head=node;
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
        size--;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        DeletionInSingleLinkedList.Node temp=head;
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
        DeletionInSingleLinkedList list = new DeletionInSingleLinkedList();
        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(90);
        System.out.println("Initial List:");
        list.display();

        System.out.println("Size of the list: "+ list.size());
        System.out.println();

        list.deleteFirst();
        list.display();
        System.out.println("New Size: "+list.size);
}
}
