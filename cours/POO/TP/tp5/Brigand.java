public class Brigand extends Humain{
    protected String look ;
    protected int nb_dames_enlevees;
    private int recompenseSurSaTete;
    private boolean prison;

    public Brigand(){
        super();
        this.look = "méchant";
        this.nb_dames_enlevees = 0;
        this.recompenseSurSaTete = 100;
        this.prison = false;
    }

    public Brigand(String nom, String boisson,String look, int nb_dames_enlevees, int recompenseSurSaTete, boolean prison){
        super(nom, boisson);
        this.look = look;
        this.nb_dames_enlevees = nb_dames_enlevees;
        this.recompenseSurSaTete = recompenseSurSaTete;
        this.prison = prison;
    }
    public Brigand(String nom){
        super(nom);
        this.look = "méchant";
        this.nb_dames_enlevees = 0;
        this.recompenseSurSaTete = 100;
        this.prison = false;
        this.boisson = "tord-boyaux";
    }

    public String kidnappe(Dame dame){

        this.nb_dames_enlevees++;
        return dame.estkidnappee() +
                super.parle("Ah ah ! "+dame.nom+
                        ", tu es mienne désormais !");
    }

    public String getNom() {
        return(this.nom+" le "+this.look);
    }

    public String sePresente(){
        String presente = super.sepresente();
        String parle = super.parle("J'ai l'air "+this.look+",\net j'ai déjà kidnappé "+this.nb_dames_enlevees+" dames !\n");
        String prix = super.parle("Ma tête est mise a prix "+this.recompenseSurSaTete+"$ ! AHAHAHH");
        return presente+parle+prix;
    }
}
