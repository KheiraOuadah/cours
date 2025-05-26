import java.util.Random;

    public class Reversi {
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
}
