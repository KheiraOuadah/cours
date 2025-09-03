package pendu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class MotUnitTest {
// quand j'appuye sur run with coverage les méthodes utilisées dans les tests ont une barre verte
// mais ça ne veut pas dire qu'il y a un test pour cette méthode

    private Mot mot;
    @BeforeEach
    public void setUp() { //méthode exécutée avant les autres méthodes grace à @BeforeEach
        Dictionnary dictionnary = Dictionnary.createDictionnary(new StringReader("mardi"));
        mot = Mot.createMot(dictionnary); // pour avoir accès à la variable mot depuis les autres méthodes
    }
    @Test
    public void testCreateMot() {
        // puisque le mot est choisi au hasard on génère un dictionnaire avec un seul mot dedans

        Assertions.assertEquals("mardi", mot.getMotCache());
        mot.decouvre('i');
        mot.decouvre('a');
        mot.decouvre('r');
        mot.decouvre('d');
        Assertions.assertFalse(mot.estTrouve());
        mot.decouvre('m');
        Assertions.assertTrue(mot.estTrouve());

    }
    // deux tests car les erreurs peuvent surtout être faites au début et à la fin du mot

    @Test
    public void testCreateMot2() {
        // puisque le mot est choisi au hasard on génère un dictionnaire avec un seul mot dedans

        Assertions.assertEquals("mardi", mot.getMotCache());
        mot.decouvre('m');
        mot.decouvre('a');
        mot.decouvre('r');
        mot.decouvre('d');
        Assertions.assertFalse(mot.estTrouve());
        mot.decouvre('i');
        Assertions.assertTrue(mot.estTrouve());

    }

    @Test
    public void testContient(){
        Assertions.assertFalse(mot.contient('z'));
        Assertions.assertTrue(mot.contient('a'));
    }

    // on ne peut pas faire de test sur méthode affiche() car affichage console uniquement (print)
    // solution peut être de tester ce qui doit être affiché et non l'affichage

    @Test
    public void testConstruitMotAffiché(){
        Assertions.assertEquals("-----",mot.construitMotAffiché());
        mot.decouvre('m');
        mot.decouvre('i');//que m et i car souvent erreur dans itérations donc 1ere et dernière lettre
        Assertions.assertEquals("m---i",mot.construitMotAffiché());

    }
}






















