// import java.util.Scanner;
import java.util.ArrayList;
public class Occurrences{
    public int occ_nombre(int[] tab){
        int[] stock = {} ;
        int occ = 1;
        for(int i = 0; i<tab.length - 1; i++){
            int actuel = tab[i];
            for(int j = i+1; j< tab.length - 1; j++){
                if(tab[i]==tab[j]){
                    occ ++;
                }
                stock += occ;
            }
        }
    }
    public static void main(String[] args){
        int[] tab = {2,4,7,2,11,7};


    }
}



/* System.out.println("Entrez le nombre d'éléments dans le tableau (entre 1 et 100) : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] tab = new int[n]; */