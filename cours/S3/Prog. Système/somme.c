#include <stdio.h>

int main(void)
{
    int somme = 0;
    int nombre = 0;
    printf("Entrez votre nombre : ");
    scanf("%d",&nombre);
    for (int i=1; i<=nombre;i++){
        somme = somme+ i;
    }
    printf("La somme de ce nombre est de : %d\n",somme);
    return 0;
}