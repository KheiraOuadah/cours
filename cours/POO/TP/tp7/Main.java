public class Main {
    public static void main(String[] args){
        Livre livre = new Livre("jkrowling",100,"Harry Potter",1);
        Roman roman = new Roman("Golden Award","ptitpois",50,"soupe au légume",2);
        Bibliotheque bibliotheque = new Bibliotheque(2);
        bibliotheque.addDocument(livre);
        bibliotheque.addDocument(roman);
        System.out.println(bibliotheque.affichOuvrages());
        
    }
}
