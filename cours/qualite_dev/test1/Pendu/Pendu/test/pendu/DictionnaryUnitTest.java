package pendu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.List;
import java.util.Random;

public class DictionnaryUnitTest {

    @Test
    public void testCreateDictionnary() {
        Dictionnary dictionnary = Dictionnary.createDictionnary(new StringReader("mardi\nmercredi\njeudi\nvendredi"));
        Assertions.assertEquals(List.of("mardi","mercredi","jeudi","vendredi"),dictionnary.lesMots);
    }

    @Test
    public void testunMotAuHazard() {
        // pour y arriver on génère un random (ex 1) et vérifie que ça retourne dic[1]
        Dictionnary dictionnary = Dictionnary.createDictionnary(new StringReader("mardi\nmercredi\njeudi\nvendredi"));
        Random monRandom = new Random(){
            @Override
            public int nextInt(int bound) {
                return 2;
            }
        };
        Assertions.assertEquals("jeudi",dictionnary.unMotAuHazard(monRandom));
    }
}
