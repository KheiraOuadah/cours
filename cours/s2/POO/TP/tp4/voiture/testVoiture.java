package voiture;

public class testVoiture {
    public static void main(String[] args) {
        Voiture voiture = new Voiture(5);
        voiture.incrementerVitesse();
        voiture.incrementerVitesse(2);
        voiture.decrementerVitesse();
        System.out.println(voiture.toString());

    }
}
