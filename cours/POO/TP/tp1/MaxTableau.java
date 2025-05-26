public class MaxTableau {
    
    public static int maxRecursif(int[] tab, int n) {
        if (n == 1) return tab[0]; 
        return Math.max(tab[n - 1], maxRecursif(tab, n - 1));
    }

    public static void main(String[] args) {
        int[] tableau = {3, 7, 2, 9, 5, 11, 6};
        int max = maxRecursif(tableau, tableau.length);
        System.out.println("Le maximum du tableau est : " + max);
    }
}
