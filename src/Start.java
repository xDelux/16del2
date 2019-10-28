public class Start {

    public static void main(String[] args) {
        String[] players = Player.startGame();
        String p1,p2;
        p1 = players[0]; p2 = players[1];

        int Balance = 1000;
        int roll =  GameMechanics.diceHit();
        System.out.println("Du slog " + roll);
        System.out.println(GameMechanics.storyText(roll));
        Balance = Account.newBalance(Balance,roll);
        System.out.println("Din nye balance er: " + Balance);






    }

}
