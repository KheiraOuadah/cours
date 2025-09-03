public class Personne {
    private String nom;
    private String prenom;
    private int jourNaiss;
    private int moisNaiss;
    private int anneeNaiss;

    public void setNom(String n_nom) {
        this.nom = n_nom;
    }

    public void setPrenom(String n_prenom) {
        this.prenom = n_prenom;
    }

    public void setDateNaiss(int j, int m, int a) {
        this.jourNaiss = j;
        this.moisNaiss = m;
        this.anneeNaiss = a;
    }

    public int ageEn2014() {
        return 2014 - this.anneeNaiss;
    }

    public String toString() {
        return nom + ", " + prenom + " (" + String.format("%02d", jourNaiss) + "/" + 
               String.format("%02d", moisNaiss) + "/" + anneeNaiss + ")";
    }
}
