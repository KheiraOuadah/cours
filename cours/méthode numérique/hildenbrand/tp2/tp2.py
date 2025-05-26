from math import *
import matplotlib.pyplot as plt  

## zoom de démarrage par défaut (-10, 10)

#### fonctions mathématiques 

def f(x):
    return x**5-3*(x**4)+2*(x**3)+5*(x**2)-7*x+2

def g(x):
    return x*sin(x)

def h(x):
    return sin(1/x)

def z(x):
    return exp(-((x-5.456454)**2)/2) + exp(-((x-58.34523)**2)/2)
    
def l(x):
    return -(x**2)+1

### fonctions graphiques

def affiche(f,xmin,xmax,pas) :
    tabx = []
    taby = []
    x=xmin
    while x < xmax :
        tabx.append(x)
        taby.append(f(x))
        x +=pas
    plt.plot(tabx,taby)
    plt.grid()
    plt.show()
    
# affiche(f,-1.5,2,0.01)
# # entre -10 10 la fonction semble st. croissante
# # mais en zoomant en -1.5 2 on observe qu'elle ne l'est pas 

# affiche(g,-50,50,0.01)
# # entre -10 10 on ne peut pas encore savoir 
# # en dézoomant en -50 50 on comprend que c'est une fonction qui oscille 

# affiche(h,-0.05,0.05,0.0000001)
# # sur -20 20 on remarque qu'elle converge vers 0 en + et -inf

# affiche(z,0,70,0.01)

def zero(f,xmin,xmax) :
    c = 0
    while(xmax-xmin > 10**-12):
        c+= 1
        m = ((xmin+xmax)/2)
        toto = f(m)*f(xmax)
        if toto>0: #on est du coté du xmax
            xmax = m
        if toto<0:# coté xmin
            xmin = m
        if toto==0:#f(m)=0 on a trouvé le zéro
            return m
    print(c)
    print("---")
    return m

def test(x):
    return x**2-2

# print(zero(test,0,2)) renvoie racine(2) : 1.4142135623724243

print(zero(f,-0.5, 0.7))
affiche(f,-1.5,2,0.01)

# Fonction pour trouver le minimum ou le maximum d'une fonction dans un intervalle [xmin, xmax]
def min_max(f, xmin, xmax): #xmin et xmax donnent une intervalle pour trouver le min ou le max
    # Fonction pour calculer la dérivée numérique de f
    def df(x):
        h = 0.000000001
        return (f(x + h) - f(x)) / h

    # Trouver le zéro de la dérivée (point critique)
    x0 = zero(df, xmin, xmax)
    return x0, f(x0)

# Fonction de test pour vérifier la fonction min_max
def test2(x):
    return x * (1 - x) 

# print(min_max(l, -1, 1))

# print(min_max(test2, 0, 1.1))

## tests :
# h = 0.0001     [x = 0.4999499999998079; y = 0.24999999750000002]
# h = 0.00001    [x=0.0.49999500000117225; y = 0.249999999975]
# h = 0.000001   [x=0.49999949998455123; y = 0.24999999999975]
# h = 0.0000001  [x=0.49999995010439313; y = 0.2499999999999975]
# h = 0.00000001  [x=0.49999999441206455; y = 0.24999999999999997]
# h = 0.000000001  [x=0.5000000067055226; y = 0.24999999999999994]
# h = 0.0000000001  [x=0.5000000476837159; y = 0.24999999999999772]

# Résultat : h avec 8 zéros après la virgule est le plus précis

# print(min_max(f, -1.4, -0.5))  # max
# print(min_max(f, 0.5, 1))  # minimum : x = 0.6967911720275879 y = 8.342244045233244










































 
