public class Start {

    public static void main(String[] args) {
        String[] players = Player.startGame();
        String p1,p2;
        p1 = players[0]; p2 = players[1];

        int Balancep1 = 1000;
        int Balancep2 = 1000;
        int roll =  GameMechanics.diceHit();
        System.out.println("Du slog " + roll);
        System.out.println(GameMechanics.storyText(roll));
        Balancep1 = Account.newBalance(Balancep1,roll);
        System.out.println("Din nye balance er: " + Balancep1);

        int player1 = Player.playerTurn(Balancep1, p1);
        int player2 = Player.playerTurn(Balancep2, p2);






    }

}
