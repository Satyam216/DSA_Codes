#include <stdio.h>

int main() {
  int Age [] = {10,20,30,40,50,60};
  //float avg, sum=0;
  int i,LowestAge= Age[0];
  int length = sizeof(Age)/sizeof(Age[0]);
   
   for(i=0;i<length;i++){

    printf("%d\n",Age[i]);
    //sum += Age[i];
if (LowestAge > Age[i]){
    LowestAge = Age[i];
  }

   }
   // avg = sum/length;
   
    printf("Lowest Age of the group: %d",LowestAge);
   

  return 0;
}