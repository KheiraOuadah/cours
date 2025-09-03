
#include <stdio.h>

int main(void)
{
    int a, b;
    printf(" Entrez deux durée en seconde :");
    scanf("%d %d", &a, &b);
    printf(" Vous avez entré %d et %d", a, b);
    int heure1, minute1, seconde1, reste;
    // int heure2, minute2,seconde2;
    heure1 = a / 3600;
    reste = a % 3600;
    minute1 = reste / 60;
    seconde1 = reste % 60;
    printf("\n La durée %d vaut : %dh %dmin %ds.", a, heure1, minute1, seconde1);

    int heure2, minute2, seconde2;
    heure2 = b / 3600;
    reste = b % 3600;
    minute2 = reste / 60;
    seconde2 = reste % 60;
    printf("\n La durée %d vaut : %dh %dmin %ds. \n", b, heure2, minute2, seconde2);

    int c = a+b;
    int heure, minute, seconde;
    heure = c / 3600;
    reste = c % 3600;
    minute = reste / 60;
    seconde = reste % 60;
    printf(" Les deux durées additionnées font : %dh %dmin %ds. \n",heure,minute,seconde);

    return 0;
}