import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 42;
        int[] loterie = new int[N];

        initTab(loterie, N);
        afficherTab(loterie, N);
    }

    static void initTab(int[] tab, int N) {
        for (int i = 0; i < N; i++) {
            tab[i] = i + 1;
        }
    }

    static void afficherTab(int[] tab, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(" " + tab[i]);
        }
        System.out.println("");
    }

    static supprElt()

    static int[] melanger(int[] tab, int N) {
        // Ici mise en place de newSize et indiceAux car pas utilisation de la boucle for mais while !
        int[] aux = new int[N];
        int newSize = N;
        int indiceAux = 0;

        while(newSize !=0 ){
            int num = new Random().nextInt(newSize);
            aux[indiceAux] = tab[num];
            
            indiceAux++;
            newSize--;
        }
    }
}