import java.util.ArrayList;
import java.util.Scanner;

public class Club {
    protected String unNomClub;
    protected ArrayList<Personne> desAdherents;

    public Club(){
    }
    public Club(Club c){
        this.unNomClub = c.unNomClub;
        this.desAdherents = c.desAdherents;
    }
    public Club(String unNomClub, ArrayList<Personne> desAdherents){
        this.unNomClub = unNomClub;
        this.desAdherents = desAdherents;
    }
    public String getUnNomClub() {
        return unNomClub;
    }
    public ArrayList<Personne> getDesAdherents() {
        return desAdherents;
    }
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nom de club");
        this.unNomClub = sc.nextLine();
        System.out.println("Combien voulez-vous d'adherents");
        int nbAdherents = sc.nextInt();
        this.desAdherents = new ArrayList<>();
        for(int i = 0; i < nbAdherents; i++) {
            Personne p = new Personne();
            p.init();
            this.desAdherents.add(p);
        }
    }
    public String toString(){
        return "club.nom : " + this.unNomClub +
                "\nclub.adherents : " + this.desAdherents;
    }

}
