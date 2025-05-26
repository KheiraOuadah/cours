import java.util.Random;
import java.util.Scanner;
public class Reversi {

    static void melangerTab(int[] tab, int N){
        // FISHER YATES - SEMAINE 1 
        for(int i = 0; i<N-1;i++){
            //générer une variable aléatoire
            int numAl = (int)(Math.random() * (N-i))+i;
            //échange entre 2 valeurs (i et variable aléatoire)
            int tmp = tab[i];
            tab[i] = tab[numAl];
            tab[numAl] = tmp;

        }
    }

    static int[] initTab(int N){
        int[] t = new int[N];
        for (int i = 0; i<N; i ++){
            t[i] = i+1;
        }
        melangerTab(t, N);
        return t;
    }
    static void afficherTab(int[] tab){
        for(int element : tab){
            System.out.println(element + " ");
        }
        System.out.println();
    }
    static boolean estTrie
    public static void main(String[] args){
        int[] tab = initTab(9);
        int i = 0;
        int p =0;
        int numTours = 0;
        Scanner scanner = new Scanner(System.in);
        // boucle infini arrêté dans la boucle
        while(true){
            afficherTab(tab);
            System.out.println("Veuillez entrer un index pour inverser" +
            "de 2 à 9. Entrez 99 pour quitter le jeu.");// 2 car 1 ne changera rien dans le tableau
            i = scanner.nextInt();
            if (i == 99){break;}// sortir de la boucle infini
            System.out.println("Veuillez entrer le nombre de pas " +
            "entre 2 et " + i +". Entrez 99 pour quitter le jeu.");
            p = scanner.nextInt();
            if (p == 99){break;}
            if(i<2 || i>9){
                System.out.println("entrée invalide");

            }else if(p<2 || p >i){
                System.out.println("nombre de pas invalide");
            }else{
                numTours++;
            }
        }

    }
}
