#include <stdio.h>

int main(void)
{
    int annee;
    printf("Entrez votre année :");
    scanf("%d",&annee);
    if (annee%400 == 0||(annee%4 == 0 && annee%100 != 0)){
        printf("%d est une année bissextile.\n",annee);
    }
    else{
        printf("%d n'est pas une année bissextile.\n", annee);
    }
    return 0;
}