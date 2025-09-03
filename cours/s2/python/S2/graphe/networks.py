import networkx as nx
import matplotlib.pyplot as plt

# graphe non orienté
""" 
G = nx.Graph()
G.add_node(1)
G.add_nodes_from([2,3,4])
G.add_edge(1,2)
G.add_edges_from([(1, 3), (1, 4), (2, 3)])
G.add_edge(1, 5) # Même si le noeud n’existe pas encore

nx.draw(G, with_labels=True)
plt.show() # plt.savefig("graphe.png")#graphe non orienté """

# graphe pondéré
""" 
G = nx.Graph()
G.add_node(1)
G.add_nodes_from([2,3,4])
G.add_edge(1, 2, weight=1)
G.add_weighted_edges_from([(1, 2, 3), (2, 3, 4), (3, 4, 5)])
G.add_edge(1, 5)
print(G)

nx.draw(G, with_labels=True)
plt.show() # plt.savefig("graphe.png")G = nx.Graph()  """



############################## Exercices

######## Exercice 1
def estRegulier(G) :
    l = []
    for node in G.nodes() :
        l.append(G.degree(node))
    for i in range (0,len(l) - 2) :
        if l[i] != l[i+1] : return False

    return True   

# version simplifiée 
def is_regular(G):
    return len(set([G.degree(k) for k in G.nodes()])) == 1
# set retourne le tableau mais en enlevant les doubles , donc si tous les sommets
# ont le même degré expl([2,2,2]) set renvoie [2] == 1 donc True 

""" 
G = nx.Graph()
G.add_node(1)
G.add_nodes_from([2,3,4])
G.add_edges_from([(1,2),(1,3),(2,3),(4,1),(4,5)])
print(estRegulier(G))
print(nx.diameter(G))
nx.draw(G, with_labels=True)
plt.show() # plt.savefig("graphe.png")G = nx.Graph()
 """


######## Exercice 2

# création du graphe
def info_graph():
    print("création du graphe dimitri")
    G = nx.Graph()
    G.add_node(1)
    G.add_edges_from([ (1,2),(1,4),(1,5),(2,3),(2,4),(2,5),(2,6),(3,6),(3,4),(3,5),(6,4),(4,5)])
    print("dimitri est un graph régulier ?", estRegulier(G))
    print("dimitri à",G.number_of_edges(),"arêtes")
    print(f"Ordre (nombre de noeuds) : {G.number_of_nodes()}")
    print("dimitri à pour diamètre",nx.diameter(G))
    nx.draw(G, with_labels=True)
    plt.show() # plt.savefig("graphe.png")

######## Exercice 3

def matAGraph(matrice):
    G = nx.Graph()
    n = len(matrice)
    for i in range (0,n):
        G.add_node(i)
        for j in range(0,n):
            if matrice[i][j] == 1:
                G.add_edge(i,j)
                print(i,j)
    
    #nx.draw(G, with_labels=True)
    #plt.show()
    return G
    
mat = [[0, 1, 1, 0, 0],
[1, 0, 1, 0, 1],
[1, 1, 0, 1, 1],
[0, 0, 1, 0, 0],
[0, 1, 1, 0, 0]] # page 17



def listeAGraph(liste):
    G = nx.Graph()
    n = len(liste)
    for i in range (0,n):
        G.add_node(i)
        for j in range(0,len(liste[i])):
            G.add_edge(i,liste[i][j])
            print(i,liste[i][j])
            
    #nx.draw(G, with_labels=True)
    #plt.show()
    return G

list = [[1,2],[0,2,4],[0,1,3,4],[2],[2,1]] # page 18

##### Affichage des graphes page 47

""" G = nx.Graph()

G.add_edges_from([(0,1),(0,2),(0,3),(1,3)])
node_color = ['red', 'blue', 'red', 'blue']
nx.draw(G,nx.circular_layout(G), node_color=node_color, with_labels=True)
plt.show()
 """

###### exercice page 54

""" G = nx.MultiDiGraph()
G.add_node("San Francisco")
G.add_edges_from([("San Francisco", "Tokyo"),("Singapore", "San Francisco"),("San Francisco","Singapore"),("Singapore", "Tokyo"),("Riga","San Francisco"),("Riga","Copenhagen"),("Copenhagen","Singapore")])
nx.draw(G,nx.circular_layout(G), with_labels=True,arrows=True,**{'node_size':6500,'arrowstyle': '-|>'})
plt.show()
 """

##### exercice page 56






















