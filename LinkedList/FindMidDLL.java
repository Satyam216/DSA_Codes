import java.util.Scanner;

class Node{
    int data;
    Node next, prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

// add the new element in the middle of the doubly linked list
class AddMid{
    public Node MidOfDLL(Node head, int newData){
        if(head == null) return null;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = new Node(newData);

        if(fast != null){ //odd case
            newNode.next = slow.next;
            newNode.prev = slow;
            slow.next.prev = newNode;
            slow.next = newNode;
        }else{
            newNode.prev = slow.prev;
            newNode.next = slow;
            slow.prev.next = newNode;
            slow.prev = newNode;
        }
        return head;
    }
}


public class FindMidDLL {
    Node head;
    Node tail;

    FindMidDLL(){
        head = tail = null;
    }

    //create the DLL

    public Node createList(int arr[]){
        if(arr.length == 0) return null;

        head = new Node(arr[0]);
        tail = head;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    // print the list
    public void  printList(Node head){
        if(head == null) System.out.println("Empty List");

        Node temp = head;
        System.out.println("List: ");
        while(temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // print in reverse order through tail
    public void  reversePrint(Node tail){
        if(tail == null) System.out.println("Empty List");

        Node temp = tail;
        System.out.println("Reversed List: ");

        while(temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int nums[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        FindMidDLL ob = new FindMidDLL();
        AddMid fm = new AddMid();

        int newData = sc.nextInt(); // data for entering in the middle

        Node head = ob.createList(nums);
        ob.printList(head);
        
        head = fm.MidOfDLL(head,newData);
        ob.printList(head);

        ob.reversePrint(ob.tail);
        
    }
}
