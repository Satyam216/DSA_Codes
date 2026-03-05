package Queue;

import java.util.*;

class Solution{
    Stack<Integer> order;
    Stack<Integer> stack;

    Solution(){
        order = new Stack<>();
        stack = new Stack<>();
    }

    public boolean empty(){
        return order.isEmpty();
    }

    public void push(int n){
        order.push(n);
        System.out.println("Order added: " + n);
    }

    public void pop(){
        if(empty()){
            System.out.println("Queue is empty");
            return;
        }

        while(!order.isEmpty()){
            stack.push(order.pop());
        }

        System.out.println("Order processed: " + stack.pop());

        while(!stack.isEmpty()){
            order.push(stack.pop());
        }
    }

    public void peek(){
        if(empty()){
            System.out.println("Queue is empty");
            return;
        }

        while(!order.isEmpty()){
            stack.push(order.pop());
        }

        System.out.println("Next order: " + stack.peek());

        while(!stack.isEmpty()){
            order.push(stack.pop());
        }
    }
}

public class QueueOperationByStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Solution queue = new Solution();

        for(int i=0; i<t; i++){
            String operation = sc.nextLine();
            if(operation.startsWith("push")){
                String[] parts = operation.split(" ");
                int n = Integer.parseInt(parts[1]);
                queue.push(n);
            }else if(operation.equals("pop")){
                queue.pop();
            }else if(operation.equals("peek")){
                queue.peek();
            }else if(operation.equals("empty")){
                System.out.println("Is queue empty? " + queue.empty());
            }
        }

    }
}
