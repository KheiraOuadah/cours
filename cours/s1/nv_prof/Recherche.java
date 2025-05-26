import java.util.Scanner;
public class Recherche {
    static int recherche_sequentielle(int[] tab, int id){
        for(int i = 0 ; i<tab.length; i++){
            if(tab[i]==id){
                return i;
            }
        }
        //si après toutes les itérations il ne trouve pas : retourne -1 sinon il sort de la fonction grâce au premier return
        return -1;
    }

    static void afficher(String[] prenoms, float[] notes, int index){
        String message = "prenom: "+prenoms[index]+", note: "+ notes[index];
        System.out.println(message);
    }

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
        int index = recherche_sequentielle(tab_id, id);
        if(index>-1){
            //j'ai trouvé un étudiant
            afficher(tab_prenoms,tab_notes,index);
        }else{
            System.out.println("Etudiant introuvable.");
        }
    }
}
