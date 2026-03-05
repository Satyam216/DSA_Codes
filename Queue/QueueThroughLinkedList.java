package Queue;   // making the simple queue using Linked List

import java.util.Scanner;

class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}

class SimpleQueue{
    Node front, rear;

    SimpleQueue(){
        front = rear = null;
    }

    public boolean isEmpty(){
        return front== null && rear == null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(rear ==  null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        front = front.next;

        if(front == null){
            rear = null;
        }
    }

    public void peek (){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Top element: " + front.data);
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueThroughLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SimpleQueue q = new SimpleQueue();

        for(int i=0; i<n; i++){
            int data = sc.nextInt();
            q.add(data);
        }

        q.peek();
        q.remove();
        q.remove();
        q.peek();
        q.printQueue();
    }

}