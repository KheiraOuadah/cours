#exercice1

def estDivisiblepar2(n):

    if str(n)[-1] in ['0', '2', '4', '6', '8'] :
        print(n,"est divisible par 2")
    if str(n)[-1] in ['0','5'] :
        print(n,"est divisible par 5")
    if str(n)[-1] in ['0'] :
        print(n,"est divisible par 10")

#exercice2

def estDivisiblepar3(n):
    c = 0

    l = list(str(n))
    for e in l :
        c += int(e)
    while len(list(str(c))) > 1:
        l2 = list(str(c))
        c = 0
        for z in l2 :
            c += int(z)
    if str(c)[-1] in ['0','3','6','9']:
        print(n,'est divisible par 3 ou 9')
    else :
        print(n,'n\'est pas divisible par 3 ou 9')

#exercice3

def estdivpar11(n):
    l = list(str(n))
    pair= 0
    impair= 0
    for i, e in enumerate(l):
        if i % 2 == 0:  # Indice pair
            pair += int(e)
        else:  # Indice impair
            impair += int(e)
    res = pair - impair
    if res % 11 == 0:
        return f"{n} est divisible par 11"
    else:
        return f"{n} n'est pas divisible par 11"


#exercice4

def estnarc(n):
    l = list(str(n))
    t=len(l)
    res = 0
    for e in l:
        res += int(e)**t
    if n == res :
        return f"{n} est un nombre narcissique"
    else:
        return f"{n} n\'est pas un nombre narcissique"

#exercice5
def div(n):
    divisors = []
    for i in range(1, n):
        if n % i == 0:
            divisors.append(i)
    return divisors


def estAmicaux(m,n) :    
    return sum(div(m)) == n and sum(div(n)) == m



#exercice 6 

def estKaprekar(n):
    carre = n ** 2
    carre_str = str(carre)
    
    for i in range(1, len(carre_str)):

        gauche = carre_str[:i]
        droite = carre_str[i:]
        
        gauche = int(gauche) if gauche != '' else 0
        droite = int(droite)
        
        if gauche + droite == n:
            return True
    return False


def tri_insertion(tableau):
    for i in range(1, len(tableau)):
        en_cours = tableau[i]
        j = i - 1
        while j >= 0 and tableau[j] > en_cours:
            tableau[j + 1] = tableau[j]
            j -= 1
        tableau[j + 1] = en_cours
        print(tableau)


print ( tri_insertion([3,5,1,2]))

















