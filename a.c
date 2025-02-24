#include<stdio.h>
#include<stdlib.h>

// Define the structure for a linked list node
struct Node {
    int data;
    struct Node *next;
};

// Function to traverse and print the linked list
void linkedListTraversal(struct Node *ptr) {
    while (ptr != NULL) {
        printf("%d  ", ptr->data);
        ptr = ptr->next;
    }
}

int main() {
    struct Node *head = NULL;  // Initialize head to NULL
    struct Node *temp = NULL;  // Temporary pointer for node creation
    struct Node *newNode = NULL;  // Pointer for new node

    int n;  // Number of nodes
    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    // Create and link the nodes based on user input
    for (int i = 0; i < n; i++) {
        newNode = (struct Node *)malloc(sizeof(struct Node));  // Allocate memory for a new node

        printf("Enter data for node %d: ", i + 1);
        scanf("%d", &newNode->data);  // Input data for the new node
        newNode->next = NULL;  // Initialize the next pointer to NULL

        if (head == NULL) {
            // If this is the first node, set head to newNode
            head = newNode;
        } else {
            // Link the new node to the end of the list
            temp->next = newNode;
        }
        temp = newNode;  // Move temp to the new last node
    }

    // Traverse and print the linked list
    printf("Linked list traversal: ");
    linkedListTraversal(head);


    return 0;
}
