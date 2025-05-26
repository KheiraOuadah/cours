public class TriInsertion {
    static void afficherTab(int[] tab){
        for(int elem : tab) System.err.print(elem + " ");
        System.err.println();
    }
    static void TriInsertionTab(int[] tab){
        for (int i =1; i< tab.length; i++){
            int cle = tab[i];
            int j = i-1;
            while(j>=0 && tab[j] > cle){
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = cle;
        }
    }
    public static void main(String[] args){
        int[] tab = {12,11,13,5,6};
        afficherTab(tab);
    }
}
