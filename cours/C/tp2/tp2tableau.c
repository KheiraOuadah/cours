#include <stdio.h>

int main(void){
    int tab[8];
    int i;
    int taille = 0 ;

    printf("contenu du tableau : [");
    for (i=0;i<8;i++){
        tab[i] = i;
        taille ++;
        if(i<7) { printf("%d,", tab[i]);}
        else { printf("%d] \n",tab[i]); }
    }
    printf("Le tableau contient %d éléments \n", taille);
    tab[2] = 12;
    printf("modifier l'élément à l'indice 2 : tab[2] = %d \n",tab[2]);

    return 0;
}
