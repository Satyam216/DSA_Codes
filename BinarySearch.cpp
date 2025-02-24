#include<iostream>
#include<math.h>
using namespace std;

int binarySearch(int arr[],int key,int size){

    int start = 0;
    int end = size-1;
    int mid = (start+end)/2 ;

    while(start <= end){
        if(arr[mid]== key){
            return mid;
        }

    //go to right part of the array
        if (key > arr[mid]){
        start = mid +1;
        }
        else {
            end = mid - 1;
        }
         mid = (start+end)/2 ;
    }
    return -1;
}

int main(){
    int n , key;
    

    //built an array
    cout <<"Enter the size of an array : ";
    cin>>n;
    int* arr = new int [n];     //declaration of an array
        for (int i=0 ; i<n ; i++){
            cout <<"Enter the element of array at Index"<<i<<":";
            cin>>arr[i];
        }
        for (int i=0 ; i<n ; i++){
            cout <<"  "<<arr[i];
        }
        cout<<endl;

     cout<<"Enter the Serching element :";
     cin>>key;

    int result = binarySearch(arr,key,n);  //(array,finding key,length of array)

    if(result != -1){
        cout<<"Element Found at Index: "<<result<<endl;
    }
    else{
        cout<<"Element is not present in the array";
    }
    delete[] arr;
    return 0;

}