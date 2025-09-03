public class testFootball {
    public static void main(String[] args) {
        Club c1 = new Club();
        Club c2 = new Club();

        System.out.println("=== Initialisation du Club 1 ===");
        c1.init();

        System.out.println("\n=== Initialisation du Club 2 ===");
        c2.init();

        c1.faireEquipe(1);
        c2.faireEquipe(1);

        boolean equipe1Valide = c1.getEquipe().size() == 11;
        boolean equipe2Valide = c2.getEquipe().size() == 11;

        if (equipe1Valide && equipe2Valide) {
            System.out.println("\nLes deux équipes sont valides. Création du match...\n");
            Match match = new Match(c1, c2);
            match.detailsDuMatch();
        } else {
            System.out.println("\nProblème avec au moins une des équipes.");
        }
    }
}
