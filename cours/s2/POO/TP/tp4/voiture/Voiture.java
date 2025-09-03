package voiture;

public class Voiture {
    private int vitesse;

    public Voiture() {
        this.vitesse = 0;
    }

    public Voiture(int vitesse) {
        this.vitesse = vitesse;
    }

    public void incrementerVitesse() {
        this.vitesse++;
    }

    public void incrementerVitesse(int newVitesse) {
        this.vitesse += newVitesse;
    }

    public void decrementerVitesse() {
        this.vitesse--;
    }

    public String toString() {
        return "Vitesse: " + this.vitesse;
    }
}
