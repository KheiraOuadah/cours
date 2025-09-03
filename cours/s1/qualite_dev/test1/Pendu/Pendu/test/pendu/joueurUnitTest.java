package pendu; // pour avoir accès à toutes les méthode contenues dans le package sauf les privées

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class joueurUnitTest {
    @Test
    public void testEstMortEtPerdVie(){
        Joueur joueur = new Joueur();
        boolean mort = joueur.estMort();
        Assertions.assertFalse(mort);
        for (int i = 0; i<9; i++){
            joueur.perdVie();
        }
        Assertions.assertFalse(mort);
        joueur.perdVie();
        Assertions.assertTrue(joueur.estMort());
    }
    @Test
    public void testProposeLettre(){
        Joueur joueur = new Joueur();
        char lettre = joueur.proposeLettre(new Scanner("mardi\no\nx"));
        Assertions.assertEquals('o', lettre);
    }
}
