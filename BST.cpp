#include<iostream>
using namespace std;


struct node {
    int data ;
    node *left ,*right;
    
    node(int value){
        this->data = value;
        this->left = null;
        this->right = null;
    }
    
} 

node* insertBST(node* root , int value){

    if (root = null){
        return new node(value);
    }
    if (value < root -> data){
        root ->left = insertBST(root ->left , value);
    }
    else{
        root ->right = insertBST(root ->rigth ,value);
    }
    return root ;
}

void inorder(node *root){
    if (root = null){
        return;
    }
    inorder(root-> left);
    cout<<root ->data<<" ";
    inorder(root ->right);
}

int main (){
    int n;
    node *root = null;
    cout<<"Insert the elements of BST"<<endl;
    cin>>n;
    root = insertBST(root,n);
    inorder(root);
}
