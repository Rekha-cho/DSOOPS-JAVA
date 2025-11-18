package com.rekha.Day66;

public class QueueUsingArray {
    int [] array;
    int front, rear, capacity,  size;

    QueueUsingArray(int capacity){
        this.capacity=capacity;
        array=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    void isEmpty(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    void isFull(){
        if(size==capacity){
            System.out.println("Queue is full");
        }
        else{
            System.out.println("Queue is not full");
        }
    }

    void enqueue(int data){
        if(size==capacity){
            System.out.println("Queue is Full");
        }
        else{
            array[++rear]=data;
            size++;
            System.out.println(data +" is enqueued");
        }
    }

    void dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        else{
            System.out.println(array[front++]+" is dequeued");
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.isEmpty();
        queue.isFull();
    }
}
