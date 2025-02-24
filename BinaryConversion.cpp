#include <iostream>
#include <math.h>
using  namespace std;

int BinaryConversion(int n)
{
    int answer = 0;
    int i = 1;
    while(n!=0){

int bit = n % 2;;
answer= (bit * i) + answer; 
n = n/2;
i= i*10;
}
return answer;

}

int BinaryTODecimal(int m)
{
    int ans = 0;
    int i =1;
    while(m > 0){
        int bit = m % 10;
        ans = (bit * i) + ans;
        m = m/10;
        i = i*2;
    }
    return ans;
}

int main(){
int n;
cout<<"Enter the number : ";
cin>> n;

int FinalAnswer = BinaryConversion(n);

 cout<<"Answer in Binary form : "<<FinalAnswer<<endl;
 
 //int m;
 //cout<<"Enter the Binary Number :"<<endl;
 //cin>>m;

int answer = BinaryTODecimal(FinalAnswer);
cout<<"Answer in Decimal is : "<<answer;


 }
