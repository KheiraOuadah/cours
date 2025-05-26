from math import *
import matplotlib.pyplot as plt  
####### 1 Suites

### question 1

def u1_iteratif (n):
    u = 2.56453
    for i in range(n):
        u = 0.9972*u + 2123.56
    return u

def u1_recursif (n):
    if n == 0:
        return 2.56453
    else:
        return 0.9972*u1_recursif(n-1) + 2123.56
    
## tester la fonction : calculer premiers termes de la suite jusqu'à u3
#print(u1_iteratif(0)) pareille pour 1,2,3 

# for i in range (100):
#     print(i,u1_iteratif(i))

# # u1 semble strictement croissante, démarrage très rapide
# # converge ?

# i = 100
# while(u1_iteratif(i)< u1_iteratif(i+1)):
#     i+=1

# print (i-1,u1_iteratif(i-1))
# print (i,u1_iteratif(i))
# print (i+1,u1_iteratif(i+1))
# #convergence vers 758414.2857142782 pour n=11096


### question 2 
def u2_iteratif(n):
    u = 2.56453
    for i in range(n):
        u = 0.9972 *u + i**2
    return u

def u2_recursif(n):
    if n == 0:
        return 2.56453
    else:
        return 0.9972 * u2_recursif(n-1) +(n-1)**2

# # test : u1 = 2.55734, u2 = 3.55018, u3 = 7.54024
# print(u2_iteratif(1),u2_recursif(1))
# print(u2_iteratif(2),u2_recursif(2))
# print(u2_iteratif(3),u2_recursif(3))

# for i in range(100):
#     print(i,u2_iteratif(i))

# # convergence : u2 semble strict. croissante à partir de n=1, démarrage lent
# # diverge vers + inf en accélérent

### question 3
def u3_iteratif(n):
    if n <= 1 : return n
    a = 0
    b=1
    for i in range(n-1):
        c = a+b
        a = b
        b = c
    return c

""" def u3_recursif(n):
    if n <= 1 : return n
    else :
        #return u3_recursif(n-1)+u3_recursif(n-2) -> JAMAIS faire de récursion double
 """
# # test : u2=1, u3=2, u4=3
# for i in range(100):
#     print(i,u3_iteratif(i))

# u3 est strictement croissant à partir de n=2, divergence vers +infini en accélération

### question 4
def uv_iteratif(n):
    u = 2
    v = 1
    
    if n == 0 :
        return u,v
    for i in range (n):
        temp = u # car sinon v prend le nouveau u et le résultat est faux
        u = (u+v) /2
        v = (2*temp*v) / (temp+v)
    return u,v

def uv_recursif(n):
    if n == 0: return 2,1
    else :
        u,v = uv_recursif(n-1)
        return (u+v)/2 , 2*u*v/(u+v)

    
# u strict. décroissant, v st. croissant
# cvergence vers 1.414.. -> racine de 2
# stab pour n = 5

# u0 peut être a supérieur 0 (pas forcément 2)
# un+1 calcul moyenne arithmétique de un et vn
# vn+1 calcul la moyenne harmonique
# un et vn se rejoigne vers une même limite, ce sont des suites adjacentes.
# limite = sqrt(a*b) donc sqrt(a), qui est la moyenne géométrique de a et b
# C'est un algo de calcul de racine extrèmement efficace 

########## 2 convergences célèbres

### question 1


#solution de x**2 = x+1 : (1 + sqrt(5) /2)
""" for i in range (1,100):
   print (i, u3_iteratif(i+1)/ u3_iteratif(i))
   # convergence vers le nombre d'or en 40 boucles
 """
### question 2

# definition de pi : 
# c'est le rapport de proportionnalité entre le périmètre d'un cercle 
# et son diamètre (p/d)
# article : approximation de pi 
# grec trouve jusqu'à 3.14 puis archimède donne 2 autres décimales 3.1416
# 1/2 + 1/4 + 1/**n = 1  ALORS QUE 1 + 1/2 + 1/3 + 1/4 = +inf

""" s = 0
for i in range(1,1000000000): # somme démarre à un 
    s += 1/i**2 
    print(i,sqrt(s*6)) """

### question 3
""" s = 0 
for i in range(0,10):
    s += ((2*sqrt(2))/9801)*(factorial(4*i)*(1103+(26390*i)))/((factorial(i)**4)*(396**(4*i)))
    print(i,s/(s**2)) """
 

####################### graphiques

# import matplotlib.pyplot as plt  
# plt.plot(x, y)

def graphique(u,nmin,nmax,pas):
    # ypoint = u
    # plt.plot(ypoint,marker = 'o')
    # plt.show()
    
    tabx = range(nmin,nmax+1,pas)
    taby = []
    for x in tabx:
        taby.append(u(x))
    plt.scatter(tabx,taby,marker='+')
    plt.show()

# graphique(u1_iteratif,0,12000,150)
# # le graphique suggère une convergence exponentielle

# graphique(u2_iteratif,0,100,2)
# # le graphique suggère une divergence quadratique vers + infini (parabole)

# graphique(u3_iteratif,0,40,1)
# # le graphique suggère une divergence exponentielle vers + infini  

def graphiquemult(tabu,nmin,nmax,pas):
    
    tabx = range(nmin,nmax+pas,pas)
    for u in tabu : #boucle sur le tableau
        taby=[]
        for x in tabx :
            taby.append(u(x))
        plt.scatter(tabx,taby,marker='+')
    plt.grid()
    plt.show()

#graphiquemult([u1_iteratif,u2_iteratif,u3_iteratif],0,27,1)

def fu1(x):
    return 0.5*x+2123.56

def fv(x):
    return cos(x)

def fw(x):
    return -x**2 + 4

def fz(x):
    return 3 /(x**2+1)

mu = 3.6
def fr(x):
    
    return mu*x*(1-x)

def convergence(f,u0,rang,xmin,xmax,pas):# pas standard = 0.01 mais range n'aime pas les float 
    tabx = []
    taby = []
    x=xmin
    while x < xmax :
        tabx.append(x)
        taby.append(f(x))
        x +=pas
    plt.plot(tabx,taby)
    plt.plot(tabx,tabx)
    tabx = []
    taby=[]
    a = u0
    for i in range(rang):
        b = f(a)
        tabx.append(a)
        tabx.append(b)
        taby.append(b)
        taby.append(b)
        a = b
    plt.plot(tabx,taby)
    plt.grid()
    
    plt.show()

""" convergence(fu1,4240,50,4240,4260,0.1)#rang = nb de point
#si u0(4240danscetexemple) < 4247.12, u st. croissante et conv vers 4247.12
#si u0(4240danscetexemple) > 4247.12, u st. decr et conv vers 4247.12
 """
 
""" # x = 0.7390851332 est la solution de x = cos(x) (chatgpt)
convergence(fv,-1,50,-3,3,0.01)
# u0 = 1 u1 = 0.55
# converge vers x par oscillations (comme pendule qui fait tic tac tic tac)
 """
 
""" # x = -x**2 + 4 ( pour trouver limite) : x1 = 1.56 x2 = -2.5615528128
#convergence(fw,-1,50,-3,3,0.01) -> rang = 50 est trop grand 
convergence(fw,2,4,-5,5,0.01) # test avec u0 = 0 / < -2.56 / > 1.56
# w diverge très rapidement vers - inf """

# x = 3 /(x**2+1)  : x = 1.2134116628
#convergence(fz,1.213,50,-5,5,0.01)
""" z = 0
for i in range(100):
    print(z)
    z = 3/(z**2+1) """
# oscille entre deux valeurs : 0.38, 2.61

convergence(fr,0.3,100,-5,5,0.01)
# mu = 3.3 (2 valeurs) mu = 3.45 (5 valeurs) mu = 3.5 (16 valeurs)
# + on se rapproche de 3.6 plus on augmente de valeurs de puissances de 2
## wikipedia suite logistique Youtube (Veritasium)



































































