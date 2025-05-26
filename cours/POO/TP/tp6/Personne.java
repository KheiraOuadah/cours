import java.util.Scanner;

public class Personne
{
    protected String nom;
    protected int age;

    public Personne(String unNom, int unAge)
    {
        this.nom = new String(unNom);
        this.age = unAge;
    }
    public Personne(Personne p){
        this.nom = p.nom;
        this.age = p.age;
    }
    public Personne(){
        //construit par défaut
    }
    public boolean equals(Object o)
    {
        //on met object en paramètre pour garder la même signature
        //que la méthode equals de la classe Object et modifier le comportement
        //initial de la méthode
        if(o == null) return false;
        if(!(o instanceof Personne)) return false;
        //demande au compilateur de considérer o comme une Personne
        Personne p = (Personne)o;
        return (this.nom.equals(p.nom) && this.age == p.age);
    }
    public int getAge() {
        return this.age;
    }
    public String getNom() {
        return this.nom;
    }
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom: ");
        this.nom = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
    }
    public String toString(){
        return "Nom: " + this.nom + "\nAge: " + this.age;
    }
}
