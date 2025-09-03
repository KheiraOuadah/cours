public class TestRecipient {
    public static void main(String[] args) {
        // Création de deux récipients
        Recipient r1 = new Recipient();
        Recipient r2 = new Recipient("Bouteille", 15);
        r2.remplir();
        r1.verser(5);

        // Simuler versement litre par litre de r2 vers r1 sans débordement
        while (!r2.estVide() && !r1.estPlein()) {
            int preleve = r2.prelever(1);
            r1.verser(preleve);
        }
        System.out.println("Après transfert litre par litre :");
        r1.afficherEtat();
        r2.afficherEtat();

        // Création du 3ème récipient
        Recipient r3 = new Recipient("Bidon", 20);
        r3.verser(r1.prelever(3));
        r3.verser(r2.prelever(2)); 
        r2.verser(r3.prelever(5)); 
        
        // Affichage final
        System.out.println("\nÉtats finaux :");
        r1.afficherEtat();
        r2.afficherEtat();
        r3.afficherEtat();

        // Trouver le récipient avec la plus grande contenance
        Recipient max = r1;
        if (r2.getContenance() > max.getContenance()) max = r2;
        if (r3.getContenance() > max.getContenance()) max = r3;

        System.out.println("\nRécipient avec la plus grande contenance : " + max.getNom());
    }
}
