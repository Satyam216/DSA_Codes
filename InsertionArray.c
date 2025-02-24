#include <stdio.h>
// insertion at specific position 
int main(){
    int i,n,a[50],num,pos;
// n is the size of array which we are selecting 

    printf("Enter the value of n : ");
    scanf("%d",&n);
    if(n>50){
        printf("Overflow Condition: You are not allow to insert the elements");
    }
    else{
    for (i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enetr the element you want to insert : ");
    scanf("%d",&num);
    
    printf("Enter the position :  ",);
    scanf("%d",&pos);
 
for (i=n-1,i>pos-1)

    printf("Elements of array=");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    }
    return 0;
}