import java.util.Scanner;

public class NombreParfait {
    
    public static boolean estParfait(int n) {
        int somme = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                somme += i;
            }
        }
        return somme == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un entier positif : ");
        int limite = scanner.nextInt();
        
        System.out.println("Les nombres parfaits inférieurs à " + limite + " sont :");
        for (int i = 2; i < limite; i++) {
            if (estParfait(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
