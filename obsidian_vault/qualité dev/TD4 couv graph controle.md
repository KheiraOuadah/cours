(moodle -> qualite dev -> TD4)
#### exercice 1
si on couvre tous les arcs on couvre tous les noeuds (dans ce graph là).

jeu de test : ensemble de cas de test
cas de test : données de test et oracle du test (res qu'on attend en executant)
données de test : ensbl des valeurs d'entrées qu'on assigne à une fonction

Données ici : mot (caché), lettres, nbVie
Oracle : echec ou bravo
2 cas de test car on peut pas couvrir hik (echec) et hjk (bravo)

Données : 
	mot = "quelconque"
	lettres = 'a'
	nbVie = 1
oracle : echec
			chemin parcouru : a b c d f g b h i k
Données :
	mot = "eau"
	lettres = 'a', 'b', 'e', 'u'
	nbVie = 2
	oracle : Bravo
			chemin : a b c d e g b c d f g (b c d e g)² b h j k

=>Couverture de tous-les-arcs
#### exercice 2

a b c d e g h b c i j l
a b c d e f h b c d e g h b c d e g h b (c d e f h b)² i k l

question : lettres_chemin est-il exécutable ? 
si on pense qu'il l'est, donner cas de test pour le prouver.
sinon, prouver logiquement que non.

complexité cyclomatique : 
graphe soleil : 13 arcs - 11 nœuds + 2 = 4 -> cette formule ne marche pas sur ce graphe car il ne porte pas que des conditions élémentaires ( il y a 5 conditions au lieu des 4 données par la formule)

graphe lune : formule marche 
**vraie formule** : nb_de_conditions_élémentaires + 1
