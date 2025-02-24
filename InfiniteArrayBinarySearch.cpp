//find a target element in the sorted infinite array through binary search

#include<iostream>
#include<math.h>
using namespace std;

int BinarySearchInfiniteArray(int arr[],int start, int end, int target){
    while(start<=end){
        int mid = start + (end-start)/2 ;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return -1;
}
int IncreaseTheArraySize(int arr[],int size, int target){  //we will increase the size of array by multipleof 2
    int start = 0;
    int end = 1;

    while(end < size && arr[end] < target){
        start = end;
        end = end * 2;
        if(end>=size){
            end = size - 1;
        }
    }
    return BinarySearchInfiniteArray(arr,start,end,target);
}

int main(){
    int target;
    int size;
    cout<<"Enter the size of an array : ";
    cin>>size;
    int* arr = new int[size];
    cout<<"Enter the element of an array : ";
        for(int i=0; i<size; i++){
            cin>>arr[i];
        }
    cout<<"Enter the Target :";
    cin>>target;
    
    int result  = IncreaseTheArraySize(arr,size,target);
        if(result != -1){
         cout<<"Target found at index : "<<result<<endl;
        }else{
            cout<<"Target is not present in the array";
        }
        delete[] arr;
        return 0;
}