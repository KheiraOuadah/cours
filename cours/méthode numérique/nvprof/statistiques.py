from math import *
import matplotlib.pyplot as plt 
import pylab 

x = [42,45,46,48,49,50,51,52,53,54,55,57,59,61]
y = [2,2,3,5,1,7,4,9,8,5,6,1,6,1]
def ex3(x,y):
    for i in range(len(x)):
        plt.bar(x,y,width=0.2)
    plt.xlabel('FCR')
    plt.ylabel('Effectifs')
    plt.show()
    
#ex3(x,y)

x=["Marron","Bleu","Noisette","Ambre","Vert","Hétérochromie"]
mycolors=["brown","blue","Chocolate","GoldenRod","green","wheat"]
y=[78,9,5,5,2,1]
def ex4(x,y):
    angles = [i*3.6 for i in y]
    print(angles)
    plt.pie(y,labels = x,colors=mycolors)
    plt.show()
    
    
#ex4(x,y)


y = [2,2,3,5,1,7,4,9,8,5,6,1,6,1]
def ex6(y):
    frequence = []
    frequence_cumulee=[]
    for i in range(len(y)):
        frequence.append(y[i]/sum(y))
    print("Fréquences : ", frequence)
    frequence_cumulee.append(frequence[0])
    for i in range(1,len(frequence)-1):
        frequence_cumulee.append(frequence[i]+frequence[i-1])
    print("Fréquences cumulées : ", frequence_cumulee)
    
ex6(y)


##### ex 14

def moy(l1,l2):
    m = 0
    for i in range (len(l1)):
        m += l1[i]*l2[i]
    return m / sum(l2)

def ecart_type(valeurs,eff):
    mean = moy(valeurs,eff)
    result = 0
    for i in range(len(valeurs)):
        result += eff[i]*(valeurs[i] - mean)**2
    variance = result/sum(eff)
    return sqrt(variance)

def liste_exhau(l1,l2):
    l = []
    for i in range (len(l1)):
        for k in range(l2[i]):
            l.append(l1[i])
    return l

l1 = [18,20,21,22,23,24,26,28]
l2 = [2,4,4,3,1,3,1,3]
l = liste_exhau(l1,l2)

l3 = [10,12,15,17,20,21,22,24,25,26,30]
l4 = [1,1,3,2,3,1,1,1,2,4,1]
ll= liste_exhau(l3,l4)

def afficher_boite(l1,l2):
    plt.boxplot([l1,l2])
    plt.ylim(8,35)
    pylab.xticks([1,2],['2017','2018'])
    plt.show()

afficher_boite(ll,l)




















