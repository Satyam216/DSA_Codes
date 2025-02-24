#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void singlyLinkedList(Node* ptr) {
    while (ptr != nullptr) {
        cout << ptr->data << " ";
        ptr = ptr->next;
    }
    cout << endl;
}

int main() {
    Node* head = nullptr;  // Initialize head to nullptr
    Node* temp = nullptr;  // Temporary pointer for node creation

    int n;  // Number of nodes
    cout << "Enter the number of nodes: ";
    cin >> n;

    // Create and link the nodes based on user input
    for (int i = 0; i < n; i++) {
        Node* newNode = new Node();  // Dynamic memory allocation

        cout << "Enter data for node " << i + 1 << ": ";
        cin >> newNode->data;  // Input data for the new node
        newNode->next = nullptr;  // Initialize the next pointer to nullptr

        if (head == nullptr) {
            // If this is the first node, set head to newNode
            head = newNode;
        } else {
            // Link the new node to the end of the list
            temp->next = newNode;
        }
        temp = newNode;  // Move temp to the new last node
    }

    // Traverse and print the linked list
    cout << "Linked list traversal: ";
    singlyLinkedList(head);

    return 0;
}
