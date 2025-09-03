public class Dame extends Humain{
    private String couleur_robe ;
    private String etat;

    public Dame(){}

    public Dame(String nom, String boisson, String couleur_robe, String etat){
        super(nom,boisson);
        this.couleur_robe = couleur_robe;
        this.etat = etat;
    }
    public Dame(String nom, String couleur_robe){
        super(nom);
        this.couleur_robe = couleur_robe;
        this.etat = "libre";
        this.boisson = "lait";
    }

    public String estkidnappee() {
        this.etat = "captive";
        return super.parle("AAAAAAAAAh OSKOUUUUR !!!\n");
    }

    public String estliberee() {
        this.etat = "libre";
        return super.parle("Je suis libre ! Merci mon brave.");
    }

    public void changeRobe(String couleur){
        this.couleur_robe = couleur;
        super.parle("Regardez ma nouvelle robe "+this.couleur_robe+" !");
    }
    public String getNom(){
        return ("Miss "+this.nom);
    }
    public String sePresente(){

        return super.sepresente() + super.parle("J'ai une robe de couleur "+this.couleur_robe+" !");
    }
}
