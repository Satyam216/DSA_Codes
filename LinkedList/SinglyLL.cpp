#include<ioStream>
using namespace std;

class Node{
    public:
        int data;
        Node* next;
//constructor
     Node(int value){
        data = value;
        next = nullptr;
    }
};

class SinglyLL{
    private:
        Node* head;
//constructor
    public:
    SinglyLL(){
        head = nullptr;
    }
    // insert at the begining of the list
    void  insertAtBegining(int value){
        Node* newNode =  new Node(value);
        if(head == NULL){
            head = newNode;
            return;
        }
        newNode -> next = head;
        head = newNode;
    }
    //insert at the end of the list
    void insertAtEnd(int value){
        Node* newNode = new Node(value);
        if(head == NULL){
            head = newNode;
            return;
        }
        Node* temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
    }
    //insert at any position in the list
        void insertAtPosition(int pos, int value){
            if(pos<0){
                cout<<"Enter the valid Position:"<<endl;
                return;
            }
            Node* newNode = new Node(value);
            if(pos == 1){
                newNode->next = head;
                head = newNode;
                return;
            }
            Node* temp = head;
            for(int i=1; i<pos-1; i++){
                temp = temp->next;
            }
                newNode->next = temp->next;
                temp->next = newNode;

        }

        void deleteByPosition(int position){
            //delete the first node of the list
            if(position == 1){
                Node* temp = head;
                head = head->next;
                delete temp;
            }
            //delete from any position
            else{
                Node* temp = head;
                Node* currentNode = temp->next;
                for(int i=1; i<position-1; i++){
                    temp = currentNode;
                    currentNode = currentNode->next;
                    
                }
                temp->next = currentNode->next;
                delete currentNode;
            }
        }

    //display the entire list
    void displayList(){
        Node* temp = head;
        while(temp != NULL){
            cout<<temp -> data << "->";
            temp = temp->next;
        }
        cout<<"NULL"<<endl;
    }

};
int main(){
    SinglyLL list;
    list.insertAtBegining(10);
    list.displayList();

    list.insertAtEnd(20);
    list.displayList();

    list.insertAtPosition(2,100);
    list.displayList();

    list.deleteByPosition(3);
    list.displayList();
}
