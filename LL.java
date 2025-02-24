
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL{
        Node head;

        public void insertStart(int data){
            Node NewNode = new Node(data);
            if(head == null){
                head = NewNode;
                return ;
            }
            NewNode.next = head;
            head = NewNode; 
        }

       public void insertLast(int data){
            Node NewNode = new Node(data);
            if(head == null){
                head = NewNode;
                return ;
            }
            Node temp = head; 
            while(temp.next != null){
                temp = temp.next;     
            }
            temp.next = NewNode;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "--> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String args[]){
            LL ob = new LL();
    
            ob.insertLast(12);
            ob.insertLast(14);
            ob.insertLast(16);
            ob.insertLast(18);
            ob.insertLast(20);
            ob.insertLast(22);
            ob.display();

            ob.insertStart(10);
            ob.display();

        }
    }