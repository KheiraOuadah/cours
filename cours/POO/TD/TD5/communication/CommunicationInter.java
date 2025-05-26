public class CommunicationInter extends Communication {
    private String pays;
    private double PRIX_SECONDE_PAYS = 0;

    public CommunicationInter() {}

    public CommunicationInter(float duree,String numero,String pays,double PRIX_SECONDE_PAYS) {
        super(duree,numero);
        this.pays=pays;
        this.PRIX_SECONDE_PAYS=PRIX_SECONDE_PAYS;
    }

    // constructeur par copie
    public CommunicationInter(CommunicationInter ci){
        this(ci.duree, ci.numero,ci.pays,ci.PRIX_SECONDE_PAYS);
    }

    public String getPays() {
        return this.pays;
    }

    public String toString(){
        return super.toString() + "\nPays: " + this.pays;
    }

    public void init(){
    //lecture des valeurs de duree et numero
    }

    // retourne le prix de la communication courante
    public double prixCommunication(){
        return this.duree * this.PRIX_SECONDE_PAYS ;
    }
}
