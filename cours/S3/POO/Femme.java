import java.io.*;
 
public class Femme extends Humain {
 
    private int fertilite;
 
    Femme(String nom) {
        super(nom);
        this.fertilite = 0;
    }
 
    Femme(int age, int poids, String nom, int fertilite) {
        super(age, poids, nom);
        this.fertilite = fertilite;
    }
 
    int getFertilite() {
        return this.fertilite;
    }
 
    public void vieillir() {
        super.vieillir();

        if (age == 15) this.fertilite = loto.nextInt(100-0) + 0;

        if (age <= 20) poids = 3+(int)(2.6*age);
        else if (age >= 50) poids += (age % 2);
    }
 
    public Humain rencontre (Homme h) {

        if (!(this.age>=15 && this.age<=50 && h.age > 15)) return null; // ! signifie false

        if (this.poids > 150 || h.poids >150) return null;

        int f = loto.nextInt(100-0) + 0;
        if (f > this.fertilite) return null;

        int p = loto.nextInt(100-0) + 0;
        if (p<50){
            Homme h1 = new Homme(h.nom+this.nom);
        }else{
            Femme f1 = new Femme(this.nom+h.nom);
        }

        int g = loto.nextInt(20-0) + 0;
        h.poids += 10;
        this.poids += g;

        return (h1 || f1) ;
    }
 
    protected void setEsperanceVie() {
        this.esperanceVie = loto.nextInt(95-55) + 55 ;
    }
}
