package Tests;

import Spil.GameMechanics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMechanicsTest {

    @Test
    void diceHit() {
        int test = GameMechanics.diceHit();
        if (test > 2 && test < 12 ) {
            System.out.println("Test gennemført");
        }
        else {
            System.out.println("Fejl ved test, resultat er ikke inden for parameterne");
        }
    }
}