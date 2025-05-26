public class Personne {
    private String nom;
    private String prenom;
    private int jourNaiss;
    private int moisNaiss;
    private int anneeNaiss;
    private String sexe; // "Homme" ou "Femme"
    private boolean estMarie;
    private Personne conjoint;

    public Personne(String nom, String prenom, int jour, int mois, int annee, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.jourNaiss = jour;
        this.moisNaiss = mois;
        this.anneeNaiss = annee;
        this.sexe = sexe;
        this.estMarie = false;
        this.conjoint = null;
    }

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

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int ageEn2014() {
        return 2014 - this.anneeNaiss;
    }

    public boolean estMarie() {
        return this.estMarie;
    }

    public Personne getConjoint() {
        return this.conjoint;
    }

    public String toString() {
        String info = nom + ", " + prenom + " (" +
                      String.format("%02d", jourNaiss) + "/" +
                      String.format("%02d", moisNaiss) + "/" + anneeNaiss + 
                      "), Sexe : " + sexe;
        if (estMarie) {
            info += ", Marié(e) à : " + conjoint.prenom + " " + conjoint.nom;
        } else {
            info += ", Célibataire";
        }
        return info;
    }

  // Nouvelles fonctionss
    public boolean marier(Personne autre) {
        if (this.ageEn2014() < 18 || autre.ageEn2014() < 18) return false;
        if (this.estMarie || autre.estMarie) return false;

        this.estMarie = true;
        this.conjoint = autre;
        autre.estMarie = true;
        autre.conjoint = this;
        return true;
    }


    public boolean estMarieAvec(Personne autre) {
        return this.conjoint == autre && autre.conjoint == this;
    }


    public void annulerMariage() {
        if (this.estMarie && this.conjoint != null) {
            Personne ancienConjoint = this.conjoint;
            this.estMarie = false;
            this.conjoint = null;

            ancienConjoint.estMarie = false;
            ancienConjoint.conjoint = null;
        }
    }
}
