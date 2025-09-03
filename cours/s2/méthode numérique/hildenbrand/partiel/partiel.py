from math import *
import matplotlib.pyplot as plt  
#sujet 2A

def f(x):
    return -(x**5)+(28.133*(x**4))+(60.56533*(x**3))-(176.950661*(x**2))-(206.083661*x)-238.5159919


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

affiche(f,-100,100,1) # la fonction semble de prime abord st. décroissante
affiche(f,-10,10,0.1) # puis en zoomant on se rend compte qu'elle ne l'est pas
affiche(f,-5,5,0.1) # on remarque une petit bosse avec ce zoom 

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

#print(zero(f,-5,-2)) #-> -3.259923652057978
#print(zero(f,-2,5)) #-> 2.4429441773887675
#print(zero(f,29,31)) # -> 29.949979474708925
#affiche(f,26,31,0.1)

################# exercice 2

def u(n):
    u = 0.3
    for i in range(n):
        u = (3.82844*u) - (3.82844*(u**2))
    return u

def graphique(u,nmin,nmax,pas):

    
    tabx = range(nmin,nmax+1,pas)
    taby = []
    for x in tabx:
        taby.append(u(x))
    plt.scatter(tabx,taby,marker='+')
    plt.show()
    
"""
for i in range (100):
    print(u(i))
    """
affiche(u,0,100,1)
# en affichant sur 0 à 100 on comprend que c'est une suite qui oscille de façon désordonnée

affiche(u,0,1000,10)
# en affichant sur 0 à 1000 on voit qu'à partir de 200 les oscillations se 
# stabilisent entre 0.15 et 0.95 sur + Infini (onde sinusoidale)

    
    
    
    
    
    
    
    
    
    
    





