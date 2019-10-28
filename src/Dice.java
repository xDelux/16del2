import java.util.Random;

public class Dice {

    public static int diceHit() {
        int diceRoll1, diceRoll2, total;
        Random rand = new Random();
        diceRoll1 = rand.nextInt(6) + 1;
        diceRoll2 = rand.nextInt(6) + 1;
        total = diceRoll1+diceRoll2;
        return total;
    }

}

