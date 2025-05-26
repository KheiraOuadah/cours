import java.util.Scanner;

public class Etudiant extends Personne {
    protected String unNumeroEtudiant;
    protected String uneFac;

    public Etudiant(){
        //même principe que salarié
        // initialise automatiquement
    }
    public Etudiant(Etudiant e){
        super(e);
        this.unNumeroEtudiant = e.unNumeroEtudiant;
        this.uneFac = e.uneFac;
    }
    public Etudiant(String unNom, int unAge, String unNumeroEtudiant, String uneFac){
        super(unNom, unAge);
        this.unNumeroEtudiant = unNumeroEtudiant;
        this.uneFac = uneFac;
    }

    @Override
    public boolean equals(Object o) {
        Etudiant e = (Etudiant) o;
        return (super.equals(o)
        && unNumeroEtudiant.equals(e.unNumeroEtudiant)
        && uneFac.equals(e.uneFac));
    }

    public String getFaculte(){
        return this.uneFac;
    }
    public String getNumeroEtudiant(){
        return this.unNumeroEtudiant;
    }
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom: ");
        this.nom = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        System.out.print("Une faculte: ");
        this.uneFac = sc.nextLine();
        System.out.print("Numéro Etudiant: ");
        this.unNumeroEtudiant = sc.nextLine();
    }
    public String toString(){
        return super.toString() + "\nFaculté : " +this.uneFac
                + "\nNuméro Etudiant :"+this.unNumeroEtudiant;
    }
}
