package com.rekha.Day66;

public class QueueUsingLinkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLinkedList(){
        front=null;
        rear=null;
        size=0;
    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front=rear=newNode;
        }
        else{
            rear.next = newNode;
            rear=newNode;
        }
        size++;
        System.out.println(data+"enqueued");
    }

    void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data + "dequeued");
        front= front.next;
        size--;
    }

    void isEmpty(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    void printQueue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
    }
}
