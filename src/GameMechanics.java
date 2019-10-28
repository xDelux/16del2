import java.util.Random;

public class GameMechanics  {

    public static int diceHit() {
        int diceRoll1, diceRoll2, total;
        Random rand = new Random();
        diceRoll1 = rand.nextInt(6) + 1;
        diceRoll2 = rand.nextInt(6) + 1;
        total = diceRoll1+diceRoll2;
        return total;
    }
    public static String storyText(int roll){
        switch (roll) {
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
            case 11 :
            case 12 :
            default:
    }


}

