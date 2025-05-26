import java.util.ArrayList;
import java.util.Scanner;

public class Club {
    private String nom;
    private ArrayList<Footballeur> joueurs = new ArrayList<>();
    private ArrayList<Footballeur> equipe;

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom du club : ");
        this.nom = sc.nextLine();
        System.out.print("Combien de joueurs à ajouter (au moins 12): ");
        int nb = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nb; i++) {
            System.out.println("Joueur " + (i + 1));
            Footballeur f = new Footballeur("", 0);
            f.init();
            f.mettreajourClub(this);
            joueurs.add(f);
        }

    }
    public boolean contientJoueur(Footballeur f) {
        return joueurs.contains(f);
    }
    public ArrayList<Footballeur> listeJoueurs() {
        return joueurs;
    }

    public void faireEquipe(int performanceMin) {
        equipe = new ArrayList<>();
        for (Footballeur f : joueurs) {
            if (f.getIndice() >= performanceMin && equipe.size() <= 11) {
                equipe.add(f);
            }
        }
    }

    public void afficher() {
        System.out.println("Club : " + nom);
        System.out.println("Joueurs :");
        for (Footballeur f : joueurs) {
            f.toString();
        }
        if (equipe != null) {
            System.out.println("Équipe pour le prochain match :");
            for (Footballeur f : equipe) {
                f.toString();
            }
        }
    }
    public String getNom() {
        return nom;
    }
    public ArrayList<Footballeur> getEquipe() {
        return equipe;
    }
}





















