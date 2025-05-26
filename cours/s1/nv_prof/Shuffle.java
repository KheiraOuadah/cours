import java.util.Random;

public class Shuffle {

    static void initLoterie(int[] tab, int N) {
        for(int i = 0; i < N; i++) {
            tab[i] = i+1;
        }
    }

    static void afficherElems(int[] tab, int N) {
        for(int i =0; i < N; i++) {
            System.out.print(tab[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    static int[] supprimerElement(int[] tab, int N, int index) {
        int[] autreTab = new int[N-1];
        // Suppression
        for(int i = 0, k = 0; i < N; i++) {
            if(i == index) {
                continue;
            }
            autreTab[k] = tab[i];
            k++;
        }
        return autreTab;
    }

    static int[] shuffle_aux(int[] tab, int N) {
        int[] aux_tab = new int[N];
        int newSize = N;
        int indice_aux = 0;
        while(newSize != 0) {
            int num = new Random().nextInt(newSize);
            aux_tab[indice_aux] = tab[num];
            tab = supprimerElement(tab, newSize, num);
            indice_aux++;
            newSize--;
        }
        return aux_tab;
    }
    public int[] shuffle_fyates(int[] tab, int N){
        for (int i = N-1; i>0;i--){
            // pour inclure i il faut mettre i+1 pas i 
            int num = new Random().nextInt(i+1);
            int temp = tab[num];
            tab[num] = tab[i];
            tab[i] = temp;
        }
        return tab;
    }
    public static void main(String args[]) {
        int N = 42; // nb max dans le jeu
        int[] loterie = new int[N];

        initLoterie(loterie,N);
        afficherElems(loterie,N);
        int[] tabMelange = shuffle_fyates(loterie, N);
        afficherElems(tabMelange, 7);
    }
}


