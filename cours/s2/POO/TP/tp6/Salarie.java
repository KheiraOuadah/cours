import java.util.Scanner;

public class Salarie extends Personne{
    protected String unNumeroSecu;
    protected String unEmployeur;

    public Salarie() {
        // puisque classe descendant de personne
        // prend le constructeur par défaut de Personne
        // et initialise tout seul les 4 attributs
    }
    public Salarie(Salarie s) {
        super(s);
        this.unNumeroSecu = s.unNumeroSecu;
        this.unEmployeur = s.unEmployeur;
    }
    public Salarie(String unNom, int unAge, String unNumeroSecu, String unEmployeur) {
        super(unNom, unAge);
        this.unNumeroSecu = unNumeroSecu;
        this.unEmployeur = unEmployeur;
    }

    //redéfinir méthode equals (Personne) car sinon ne compare pas
    // les nv attributs comme le num de secu ou l'employeur
    @Override
    public boolean equals(Object o) {
        Salarie s = (Salarie) o;
        return (super.equals(o)
                && this.unNumeroSecu.equals(s.unNumeroSecu)
                && this.unEmployeur.equals(s.unEmployeur));
    }

    public String getEmployeur() {
        return this.unEmployeur;
    }
    public String getUnNumeroSecu() {
        return this.unNumeroSecu;
    }
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom: ");
        this.nom = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        System.out.println("Numéro de sécurité sociale : ");
        this.unNumeroSecu = sc.nextLine();
        System.out.println("Employeur : ");
        this.unEmployeur = sc.nextLine();
    }
    public String toString() {
        return super.toString() + "\nNuméro de sécurité sociale : "
                + this.unNumeroSecu + "\nEmployeur : " + this.unEmployeur;
    }
}

