#include<iostream>
#include<math.h>
using namespace std;

int linearSearch(int n[],int key,int size){

    for (int i=0; i<size; i++){
        if(n[i]==key){
            return i;
        }
       
    }
 return -1;

}

int main (){
    int n;
    int key;
    //int N; 

    cout<<"Enter the size of an array : ";
    cin>>n;


    int* arr= new int[n];    //creating the array
     
     for (int i=0; i<n; i++){
        cout<<"Enter the Element of array at index "<<i<<":";
        cin>>arr[i];
     }
      
    //N= sizeof(arr)/sizeof(arr[0]); //array length
    
     cout<<"Enter the Finding key : "; //key value
     cin>>key;

    int ans = linearSearch(arr,key,n); //call the function
    if(ans != -1){
        cout<<"Key found at index :"<<ans<<endl;
    }
    else{
        cout<<"Key is not found";
        
    }
    delete[] arr;
    return 0;
}