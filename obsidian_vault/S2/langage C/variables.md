Pour les types entiers ( `signed char`, `int`, `long`…), il existe d'autres types dits `unsigned`(non signés) qui, eux, ne peuvent stocker que des nombres positifs. Pour les utiliser, il suffit d'écrire le mot `unsigned` devant le type.

Mieux vaut initialiser la variable dès le début :
**int** var = 5 ;

Si je veux que la variable ne change jamais de valeur:
**const** int VAR = 5; (par défaut la mettre en majuscule)