#include<iostream>
using namespace std;


struct node {
    int data ;
    node *left ,*right;
    
    node(int value){
        this->data = value;
        this->left = nullptr;
        this->right = nullptr;
    }
};  

node* insertBST(node* root , int value){

    if (root = nullptr){
        return new node(value);
    }
    if (value < root -> data){
        root ->left = insertBST(root ->left , value);
    }
    else{
        root ->right = insertBST(root ->right ,value);
    }
    return root ;
}

void inorder(node *root){
    if (root = nullptr){
        return;
    }
    inorder(root->left);
    cout<<root ->data<<" ";
    inorder(root->right);
}

int main (){
    int n, val;
    node *root = nullptr;
    cout << "How many elements to insert in BST? ";
    cin >> n;
    cout << "Insert the elements of BST:" << endl;
    for(int i = 0; i < n; i++) {
        cin >> val;
        root = insertBST(root, val);
    }
    cout << "Inorder traversal: ";
    inorder(root);
    cout << endl;
}
