package Queue;

import java.util.Scanner;

class Queue{
        int queue[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n){
            queue = new int[n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){  //first element ko add krke front ka index 0 kr rhe h ye khali first element add hote hue kaam krega
                front = 0;
            }
            rear = (rear+1) % size;
            queue[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("No element in the queue");
                return -1;
            }
            int removeElement = queue[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1) % size;
            }
            
            return removeElement;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("No element in the queue");
                return -1;
            }
            return queue[front];
        }
    }


public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);

        for(int i=0; i<n; i++){
            q.add(sc.nextInt());
        }
        System.out.println("Removed Element: " + q.remove());
        System.out.println("Removed Element: " + q.remove());
        q.add(10);
        q.add(15);

        for(int i=0; i<n; i++){
            System.out.print(q.queue[i] + " ");
        }

        System.out.println("\nTop Element: "+q.peek());
        q.add(12);
       
    }
    
}
