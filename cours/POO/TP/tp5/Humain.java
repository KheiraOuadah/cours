public class Humain {
    protected String nom;
    protected String boisson = "Eau";

    public Humain(){
        this.nom = "";
        this.boisson = "";
    }

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = boisson;
    }
    public Humain(String nom) {
        this.nom = nom;
    }

    public Humain(Humain h) {
        this(h.nom, h.boisson);
    }

    public String getNom() {
        return this.nom;
    }
    public String getBoisson() {
        return this.boisson;
    }

    public String parle(String texte){
        return "("+this.nom+") - "+texte;
    }

    public String sepresente() {
        return parle( "Bonjour, moi c'est "+this.nom+",\net ma boisson favorite est le "+this.boisson+ " !\n");
    }
}
