public class Main {

    public static void main(String[] args) {
        String[] players = Player.startGame();
        String p1,p2;
        p1 = players[0]; p2 = players[1];

        int bal1 = 1000;
        int bal2 = 1000;

         boolean run = true;

         while (run == true) {
             bal1 = Player.playerTurn(bal1, p1);
             bal2 = Player.playerTurn(bal2, p2);

         }





    }

}
