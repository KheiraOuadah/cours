/**
 * La classe Recipient représente un récipient d'eau avec un nom, une capacité maximale
 * et une contenance actuelle.
 */
public class Recipient {
    private String nom;
    private int capacite;
    private int contenance;

    /** Constructeur par défaut */
    public Recipient() {
        this.nom = "NoName";
        this.capacite = 10;
        this.contenance = 0;
    }

    /**
     * Constructeur personnalisé
     * @param nomR nom du récipient
     * @param capa capacité maximale du récipient
     */
    public Recipient(String nomR, int capa) {
        this.nom = nomR;
        this.capacite = capa;
        this.contenance = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getContenance() {
        return contenance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setContenance(int contenance) {
        this.contenance = Math.min(contenance, capacite);
    }

    public void afficherEtat() {
        System.out.println(nom + " : " + contenance + "/" + capacite + " litres");
    }

    public boolean estVide() {
        return contenance == 0;
    }

    public boolean estPlein() {
        return contenance == capacite;
    }

    /**
     * Prélève n litres du récipient
     * @param n quantité à prélever
     * @return quantité réellement prélevée
     */
    public int prelever(int n) {
        int preleve = Math.min(n, contenance);
        contenance -= preleve;
        return preleve;
    }

    /**
     * Verse n litres dans le récipient (débordement évité)
     * @param n quantité à verser
     */
    public void verser(int n) {
        contenance = Math.min(contenance + n, capacite);
    }

    public void remplir() {
        contenance = capacite;
    }

    public void vider() {
        contenance = 0;
    }
}
