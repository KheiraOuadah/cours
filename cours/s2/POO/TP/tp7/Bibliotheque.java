import java.util.ArrayList;
public class Bibliotheque {
    ArrayList<Document> listeDoc;

    public Bibliotheque(int nombreDoc){
        this.listeDoc = new ArrayList<Document>(nombreDoc);
    }

    public String affichOuvrages(){
        String liste = null;
        
        for (int i = 0; i < listeDoc.size();i++) {
            liste += listeDoc.get(i)+"\n";
        }
        return liste;
    }

    public Document iemeDoc(int index){
        return listeDoc.get(index);
    }

    public void addDocument(Document doc){
        listeDoc.add(doc);
    }

    public boolean remDocument(Document doc){
        for (Document document : listeDoc){
            if(document == doc){listeDoc.remove(doc);}
        }
        return false;
    }
}
