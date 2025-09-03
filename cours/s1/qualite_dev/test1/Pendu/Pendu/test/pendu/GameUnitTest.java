package pendu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GameUnitTest {
    @Test
    public void testPlayJoueurGagnant() {
        // on a remplacé les print par des return car on ne peut pas les tester
/*        Mot mot = Mot.createMot(Dictionnary.createDictionnary(new StringReader("bonjour")));
        Joueur joueur = new Joueur(){ // créer une classe fille de Joueur qui me permet de créer un joueur ( il a les mêmes méthodes que classe joueur SAUF celle que j'ai crée
            private List<Character> lesLettres = new ArrayList<>(List.of('e','o','u','t','r','b','n','j'));
            @Override
            public char proposeLettre(Scanner scan) {
                return lesLettres.remove(0);
            }
        };
*/
        Mot mot = Mockito.mock(Mot.class); // bouchon qui se fait passer pour la classe mais n'en ait pas un, ne possède aucune méthode de la classe
        Joueur joueur = Mockito.mock(Joueur.class);
        Mockito.when(joueur.estMort()).thenReturn(false); // chaque fois qu'on appelle estMort() le mock retourne faux
        Mockito.when(mot.estTrouve()).thenReturn(false,false,false,false,false,true); // simulation ou le joueur va rentrer dans la boucle
        // 5 fois puis va trouver le mot
        Mockito.when(mot.contient(Mockito.anyChar())).thenReturn(true,false,false,true,true);

        Game game = new Game(joueur, mot);
        String resultatFinDuJeu = game.play();
        Assertions.assertEquals(resultatFinDuJeu, "Bravo");
        Mockito.verify(joueur,Mockito.times(2)).perdVie();
        Mockito.verify(mot,Mockito.times(3)).decouvre(Mockito.anyChar());
        Mockito.verify(mot,Mockito.never()).getMotCache();
    }
    @Test
    public void testPlayJoueurPerdant() {
        //couvrir un chemin intérieur dans lequel le joueur perd la partie
        Mot mot = Mockito.mock(Mot.class); // bouchon qui se fait passer pour la classe mais n'en ait pas un, ne possède aucune méthode de la classe
        Joueur joueur = Mockito.mock(Joueur.class);
        Mockito.when(joueur.estMort()).thenReturn(false,true); // activé un chemin dasn lql on est passé 1 fois sur perdVie()
        Mockito.when(mot.estTrouve()).thenReturn(false);
        Mockito.when(mot.contient(Mockito.anyChar())).thenReturn(false);
        Mockito.when(mot.getMotCache()).thenReturn("bouteille");

        Game game = new Game(joueur, mot);
        String resultatFinDuJeu = game.play();
        Assertions.assertEquals(resultatFinDuJeu, "Ah Ah Ah, le mot bouteille a causé ta perte !!!");
        Mockito.verify(joueur).perdVie();
        Mockito.verify(mot,Mockito.never()).decouvre(Mockito.anyChar());
        // deux verification assert equals(plus fiable car résultat tjr le même) et verify(très dépendant du code car si modifier code modifier verify)
    }
}

// chemin limite : ne rentre pas dans la boucle  ;
// chemin intérieur : itère qu'une seule fois la boucle et sors ; de cb de facon on peut parcourir les chemins de la boucle






