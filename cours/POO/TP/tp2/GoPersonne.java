import java.util.Scanner;

public class GoPersonne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personne p1 = new Personne();

        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();
        p1.setNom(nom);

        System.out.print("Entrez le prénom : ");
        String prenom = scanner.nextLine();
        p1.setPrenom(prenom);

        System.out.print("Entrez le jour de naissance : ");
        int jour = scanner.nextInt();

        System.out.print("Entrez le mois de naissance : ");
        int mois = scanner.nextInt();

        System.out.print("Entrez l'année de naissance : ");
        int annee = scanner.nextInt();

        p1.setDateNaiss(jour, mois, annee);

        System.out.println("\nInformations de p1 :");
        System.out.println(p1);
        System.out.println("Âge en 2014 : " + p1.ageEn2014());

        scanner.nextLine();
        Personne p2 = new Personne();

        System.out.print("\nEntrez le nom de p2 : ");
        String nom2 = scanner.nextLine();
        p2.setNom(nom2);

        System.out.print("Entrez le prénom de p2 : ");
        String prenom2 = scanner.nextLine();
        p2.setPrenom(prenom2);

        p2.setDateNaiss(jour, mois, annee);

        System.out.println("\nInformations de p2 :");
        System.out.println(p2);
        System.out.println("Âge en 2014 : " + p2.ageEn2014());

        scanner.close();
    }
}

