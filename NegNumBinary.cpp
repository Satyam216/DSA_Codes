#include<iostream>
#include<math.h>
using namespace std;

int negativeNumberBinary(int n){
    int i =1;
    int binary = 0;

    while (n != 0)
    {
        int bit = n%2;
        binary = (bit * i) + binary;
        n= n/2;
        i = i*10;
     }
     return binary  ;


}
 int main() {
    int number;
    cout <<"Enter the Decimal Number :"<<endl;
    cin>>number;

    if (number < 0){
        int number = number * (-1);
        int ans = negativeNumberBinary(number);
        cout<<"Binary Conversion of the decimal number :"<<ans<<endl;

        int  newans = (~ans);
        newans = newans + 1;
        cout <<"Required Ans(Binary oif negative number) :"<<newans<<endl;

    }
    else{
         int ans = negativeNumberBinary(number);
         cout <<"Binary of positive number :"<<ans;

    }
}