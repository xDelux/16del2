package Tests;

import Spil.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @org.junit.jupiter.api.Test
    void startGame() {
        String[] test = {"Peter", "Jens"};
        String[] result = new String[2];
        result = PlayerStub.startGameStub();
        assertArrayEquals(test,result, "Test gennemført");
    }

    @org.junit.jupiter.api.Test
    void playerTurn() {
        //Ekstremt besværlig at lave test for.
    }
}