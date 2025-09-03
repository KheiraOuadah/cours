public class Document {
    protected int numeroEnregistrement;
    protected String titre;

    public Document() {
    }
    public Document(int numeroEnregistrement, String titre) {
        this.numeroEnregistrement = numeroEnregistrement;
        this.titre = titre;
    }
    public String toString() {
        return "Numéro d'enregistrement: " + numeroEnregistrement+
                "\nTitre: " + titre;
    }
}
