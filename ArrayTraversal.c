#include <stdio.h>

int main() {
    int i, a[5];

    printf("Enter the elements of the array: ");
    for (i = 0; i < 5; i++) {
        scanf("%d", &a[i]);
    }

    printf("The elements of the array are: ");
    for (i = 0; i < 5; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");

    return 0;
}