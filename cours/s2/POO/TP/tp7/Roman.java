public class Roman extends Livre{
    private String prixLitt;

    public Roman() {
        super();
    }
    public Roman(String prixLitt) {
        super();
        this.prixLitt = prixLitt;
    }
    public Roman(String prixLitt, String auteur, int nbPage, String titre, int numEnregistrement) {
        super(auteur, nbPage, titre, numEnregistrement);
        this.prixLitt = prixLitt;
    }

    public String toString() {
        return super.toString() +
                "\nPrix littéraire: " + this.prixLitt + "\n";
    }
}

// on peut utiliser super.super() pour la classe mère de la classe mère 
// qu'elle hérite