public class Livre extends Document{
    private String auteur ;
    private int nbPages ;

    public Livre(){
        super();
    }
    public Livre(String auteur, int nbPages, String titre,int numeroEnregistrement){
        super(numeroEnregistrement,titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public String toString(){
        return super.toString()+
                "\nAuteur: "+this.auteur+
                "\nNombres de pages: "+this.nbPages;
    }
}
