import java.util.Scanner;
public class Bourse {
    public static void main(String[] args){
        Scanner saisie = new Scanner(System.in);

        System.out.println("Combien avez-vous de frères et/ou soeurs ? : ");
        int frere = saisie.nextInt();
        if (frere < 3){
            System.out.println("Saisissez votre âge : ");
            int age = saisie.nextInt();
            System.out.println("Avez-vous fait votre service militaire ? (oui/non) : ");
            String militaire = saisie.next();
            System.out.println("Quel est le revenu mensuel de vos parents ? : ");
            int revenu = saisie.nextInt();
            if( (age<26 || age<27 && militaire=="oui") && revenu <=1200){
                System.out.println("Bourse accordée.");
            } else { System.out.println("Bourse refusée.");}
        }else{System.out.println("Bourse accordée.");}
        
    }
}
