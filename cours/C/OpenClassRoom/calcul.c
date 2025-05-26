#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("\t \t Hello world!\n");
    // pour faire une division ex 5/2 et avoir 2.5 il faut les mettre en décimal

    double resultat = 0;
    resultat = 5.0/2.0;
    printf("5/2 = %f\n",resultat);

    // le modulo est le reste d'une div 
    int modulo = 0;
    modulo = 5 % 2;
    printf("5 modulo 2 = %d \n", modulo);
    modulo *= 5;  // permet de multiplier modulo par 5


    return 0;
}