#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("\t Hello world!\n");
    
    // commentaire d'une seule ligne
    /*commentaire
    sur plusieurs lignes*/

    int nbDeVies = 5, niveau =1, age = 0;
    printf("Vous avez %d vies; niveau n°%d\n", nbDeVies,niveau);
    printf("entrez votre age :");
    scanf("%d", &age);
    printf("vous avez donc %d ans\n",age);

    return 0;
}