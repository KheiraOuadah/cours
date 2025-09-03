l1 = [2,3,4,5]
l2=[3,5,1,2]
def val_rang(n,val, eff):
    l = []
    for i in range(len(val)):
        nombre = eff[i]
        for j in range(nombre):
            l.append(val[i])
    return l[n-1]

print(val_rang(10,l1,l2))