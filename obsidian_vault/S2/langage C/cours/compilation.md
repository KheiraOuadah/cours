on peut voir les différentes étapes de compilation avec l'option '-v' de gcc
exemple: $ gcc -v hello.c

principales étapes:
	1. passage du préprocesseur ($ -E hello.c -o hello.i) -> donne résultat après passage du préprocesseur dans fichier hello.i
	2. compilation ($ gcc -S hello.c) -> donne le code assembleur
	3. assemblage($ gcc -c hello.c) -> donne le code objet(compilé)
	Les différents codes objets (.o) peuvent être combinés en un exécutable avec l'éditeur de liens (ld)

**Compilation séparée** :
Pour de gros projets, le code est généralement réparti dans plusieurs fichiers C (unités de compilation).
Pour construire l'exécutable, il faut assembler l'ensemble des unités de compilation.
Deux solutions :
	1. tout compiler en 1 seule fois : gcc -g -Og -Wall -Wextra -o mon_programme \ fichier1.c fichier2.c fichier3.c (tous les fichiers sont recompilés à chaque fois, fais automatiquement la première partie de la solution 2)
	2. compiler chaque fichier séparément puis assembler le tout :
		$ gcc -g -Og -Wall -Wextra -c fichier1.c
		$ gcc ---                          --  -c fichier2.c
		$ gcc ---                          --  -c fichier3.c
		**-> génère les codes objet : fichier1.o fichier2.o fichier3.o**
		$ gcc -g -Og -Wall -Wextra -o mon_programme \ fichier1.o fichier2.o fichier3.o

**Question : comment répartir le code dans plusieurs fichiers ?** 
exemple : on def une fonction age() et on l'utilise dans un fichier (age.c). Les fonctions age() et main() (main.c) sont dans des fichiers séparés.
compilation : $ gcc -g -Og -Wall -Wextra -o mon_programme \ main.c age.c

**Automatiser la compilation : l'outil make**
L'outil make permet d'automatiser la compilation et de ne construire que ce qui est nécessaire.
Pour cela, on décrit le projet dans un fichier appelé Makefile
-on y liste les choses à construire (ex : le programme exécutable)
-on décrit les dépendances entre les fichiers et les commandes permettant d'arriver au rés.

Make se base sur les dates des fichiers pour décider lesquels reconstruire. 

exemple avec exemple précédent : ( age.h est utilisé par les deux programmes)
					<_ age.o <- age.c          (<_ flèche vers bas)
mon_programme                           <\ <_ age.h
					<\ main.o <- main.c        (<\ flèche vers haut)

dans fichier Makefile:
	#commentaire
	mon_programme : main.o age.o (-> fichier dont j'ai besoin)
		gcc -g -Og -Wall -Wextra -o mon_programme main.o age.o
	main.o : main.c age.h
		gcc -g -Og -Wall -Wextra -c mon_programme main.c
	age.o : age.c age.h
		gcc -g -Og -Wall -Wextra -c mon_programme age.c

version optimisée :
	CC=gcc
	cflags = -g -Og -Wall -Wextra
	mon_programme : main.o age.o
		$ (CC) $(cflags) -o $@ $^
	main.o : main.c age.h
	age.o : age.c age.h
	%.o %.c
		$(CC)  $(cflags) -c $<