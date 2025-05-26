#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age = 0;
    printf("entrez votre age : \n");
    scanf("%d",&age);
    if(age>= 18)
    {
        printf("vous êtes majeur !\n");
    }

    return 0;
}