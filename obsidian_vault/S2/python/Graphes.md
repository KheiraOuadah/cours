node = sommets
edge = arêtes
Ordre du graphe (nombre de nœuds) :
	G.number_of_nodes()
Taille du graphe (nombre d'arêtes) :
	G.number_of_edges()

##### Degré d’un nœud (nombre de voisins) :
	G.degree(noeud)
##### Graphe régulier : 
tous ses sommets ont le même degré
##### Diamètre du graphe : 
la plus longue distance entre deux nœuds :
	 nx.diameter(G)
##### Matrice 
Incidence : 
	ligne : sommet
	colonne : arête
	1 si arête connecté avec sommet, 0 sinon.
	''' nx.incidence_matrix(G) '''
Adjacence :
	 ligne : sommet
	 colonne : sommet
	 1 si sommet voisin de sommet, 0 sinon.
	 ''' nx.adjacency_matrix(G).toarray() '''


