//doubly linked list

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DLL {
    Node head;
    Node tail;

    DLL() {
        head = null;
        tail = null;
    }

    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void pushBack(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void popFront(){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        if(head != null){
            head.prev = null;
        }else{
            tail = null;
        }
        temp.next = null;  //this is not mandatory but it good for data structure clean code 

    }
    public void popBack(){
        if(tail == null){
            System.out.println("DLL is empty");
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        }else{
            head = null;
        }
        temp.prev = null;   //isme ham delete node ko existing node se ek dam alg kr rhe hai
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reversePrint() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

}

public class DLinkedList {
    public static void main(String args[]) {
        DLL ob = new DLL();
        ob.insertAtBegining(21);
        ob.insertAtBegining(23);
        ob.insertAtBegining(34);
        ob.insertAtBegining(45);
        ob.insertAtBegining(55);
        ob.insertAtBegining(26);
        ob.print();

        ob.reversePrint();

        ob.pushBack(89);
        ob.pushBack(77);
        ob.print();

        ob.reversePrint();

        ob.popFront();
        ob.print();
        ob.reversePrint();

        ob.popBack();
        ob.print();
        ob.reversePrint();
    }
}
