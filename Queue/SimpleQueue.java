package Queue; // using array

import java.util.Scanner;

public class SimpleQueue {
    static class Queue{
        static int queue[];
        static int size;
        static int rear = -1;

        Queue(int n){
            queue = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == size-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
                rear++;
                queue[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("No element in the queue");
                return -1;
            }
            int front = queue[0]; 
            for(int i=0; i<rear; i++){
                queue[i] = queue[i+1];  
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("No element in the queue");
                return -1;
            }
            return queue[0];
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);
        
        for(int i=0; i<n; i++){
            q.add(sc.nextInt());
        }

        while(!q.isEmpty()){
            System.out.println("Top element: " + q.peek());
            q.remove();
        }

    }
    
}
