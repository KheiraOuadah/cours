compiler un prog : 
gcc -g -Og -Wall -Wextra -o nom_fich_sortie nom_fich.c

exécuter : ./toto

bash: ./tp2tableau.c: Permission non accordée : 

#### Pointeurs et allocation dynamique
Un pointeur est une variable particulière qui contient une adresse mémoire (adresse d'une autre variable)

Pour accéder a la valeur stockée à l'adresse donnée par le pointeur, on utilisera l'opérateur : *  
expl : *pi  // valeur à l'adresse pi

On peut accéder à la ième à partir d'un pointeur avec la notation [].
expl : 
pi[7] * équivalent à (pi +7)
pi[0] * équivalent à pi

#### Pointeurs et fonctions 
Les pointeurs peuvent être utilisés pour passer l'adresse d'une variable à une fonction. C'est utile par exemple :
- pour passer un tableau en paramètre à une fonction;
- pour pouvoir modifier la valeur de la variable depuis la fonction;
- lorsqu'on souhaite éviter une copie de la valeur de la variable.
expl:
	int valeur1 = 5;
	int valeur2 = 7;  On souhaite une fonction qui échange valeurs

	void echanger(int a, int b){
	int c = a;
	a = b;
	b= c;        NE FONCTIONNE PAS.
	}
	echanger(valeur1, valeur2);

	void echanger2(int *a, int *b){
	int c = *a;
	*a = *b;
	*b= c;        FONCTIONNE.
	}
	echanger2(&valeur1,&valeur2);

#### Allocation dynamique

L'allocation mémoire(réservation) automatique a des inconvénients:
- le nb de variable est fixé à l'écriture du programme
solution:
- mémoire est alloué à la demande par la fonction :
	void * maloc(size_t taille);
- réserve un espace de taille octets
- mémoire peut être libéré avec : void free(void * ptr)
- nb -> maloc retourn NULL en cas d'échec 
exemple : A REPRENDRE SUR QLQ 



