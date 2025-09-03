import java.util.Scanner;

public class Footballeur {
    private String nom;
    private int indice;
    private Club club;

    public Footballeur() {
        this.nom = "";
        this.indice = 0;

    }
    public Footballeur(String nom, int indice) {
        this.nom = nom;
        this.indice = indice;
    }

    public void mettreajourClub(Club club) {
        this.club = club;
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom du joueur : ");
        this.nom = sc.nextLine();
        System.out.print("Indice du joueur (entier positif please): ");
        this.indice = sc.nextInt();
    }
    public String toString(){

        return "Footballeur [nom = " + this.nom + ", indice = " + this.indice
                + ", club = " + this.club + "]";
    }

    public int getIndice(){
        return this.indice;
    }
}
