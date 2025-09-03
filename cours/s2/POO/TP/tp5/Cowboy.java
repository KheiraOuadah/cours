public class Cowboy extends Humain{
    private int popularite;
    private String caracteristique;

    public Cowboy(){
        super();
        this.popularite = 0;
        this.caracteristique = "vaillant";
    }
    public Cowboy(String nom, String boisson, int popularite, String caracteristique){
        super(nom, boisson);
        this.popularite = popularite;
        this.caracteristique = caracteristique;
    }
    public Cowboy(String nom) {
        super(nom);
        this.popularite = 0;
        this.caracteristique = "vaillant";
        this.boisson = "whisky";
    }

    public String tireSurBrigand(Brigand brigand){
        String parle = super.parle("Prend ça, rascal !\n");
        return parle + ("Le "+this.caracteristique+" "+this.nom+" tire sur "+
                brigand.nom+" le "+brigand.look+". PAN ! ");
    }

    public String libereDame(Dame dame, Brigand brigand){
        this.popularite++;
        brigand.nb_dames_enlevees--;
        return dame.estliberee();
    }

    public String sePresente() {
        String presente = super.sepresente();
        return presente + super.parle("Les gens me trouvent "+this.caracteristique+", et j'ai sauvé "+this.popularite+" dames.");
    }

}
