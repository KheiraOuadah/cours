import java.util.Scanner;

public class Recherche {
    public static void main(String[] args){
        int[] tab_id = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        String[] tab_prenoms = {"p1","p2","p3","p4","p5","p6","p7","p8",
        "p9","p10","p11","p12","p13"};
        float[] tab_notes = {1.5f,2.5f,3.5f,4.5f,5.5f,6.5f,7.5f,8.5f,9.5f,
            10.5f,11.5f,12.5f,13.5f};
        int id = 0;
        System.out.println("Saisir un identifiant étudiant : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        int index = recherche_dichotomique(tab_id, id);
        if(index>-1){
            //j'ai trouvé un étudiant
            afficher(tab_prenoms,tab_notes,index);
        }else{
            int index_n = -(index+1);
            System.out.println("Etudiant introuvable !");
            int[] id_n = insererPosition(tab_id, index_n, id);
            System.out.println("liste des index disponibles :");
            for(int i:id_n){
                System.out.println(i+ " ");

            }
        }
    }
    static int recherche_dichotomique(int[] tab, int cle){
        int low = 0;
        int high = tab.length - 1;
        while(high>= low){
            int milieu = (low+high) /2;
            if(cle<tab[milieu]){
                high = milieu - 1;
            }else if(cle==tab[milieu]){
                return milieu;
            }else {
                low = milieu+1;
            }
        }
        return (-low-1);
    }

    static int[] insererPosition(int[] tab, int index, int cle){
        int[] tab_n = new int[tab.length+1];
        for(int i = 0;i<tab_n.length;i++){
            if(i<index){
                tab_n[i] = tab[i];
            
            } else if(i==index){
                tab_n[i] = cle;
            }else{
                tab_n[i] = tab[i-1];
            }
        }
        return tab_n;
    }

    static void afficher(String[] prenoms, float[] notes, int index){
        String message = "prenom: "+prenoms[index]+", note: "+ notes[index];
        System.out.println(message);
    }
}

