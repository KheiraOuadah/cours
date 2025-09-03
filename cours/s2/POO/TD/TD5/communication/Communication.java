public class Communication{
    protected float duree; // durée de la communication
    protected String numero; // numéro appelé
    public static final double PRIX_SECONDE = 0.01; // prix de la seconde

    public Communication( ) { } //constructeur vide

    // initialise une nouvelle communication de durée d et de numéro num
    public Communication(float d, String num){
        this.duree = d;
        this.numero = num;
    }

    // constructeur par copie
    public Communication(Communication c){
        this(c.duree, c.numero) ;
    }

    // retourne la durée de la communication
    public float getDuree(){
        return this.duree ;
    }

    // retourne le numéro appelé
    public String getNumero(){
        return this.numero ;
    }

    // retourne la chaîne représentant la communication courante
    public String toString(){
        return ("duree = " + this.duree
                + "\nnumero appele = " + this.numero);
    }

    // initialise interactivement la communication courante
    public void init(){
//lecture des valeurs de duree et numero
    }

    // retourne le prix de la communication courante
    public double prixCommunication(){
        return this.duree * Communication.PRIX_SECONDE ;
    }
} // fin classe Communication
