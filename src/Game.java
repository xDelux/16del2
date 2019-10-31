public class Game {

    public static boolean winCondition(int bal, String player) {
        boolean stopGame;
        if (bal >= 3000) {
            System.out.println(player + " har vundet spillet!! ");
            return stopGame = true;
        }
        else {
            stopGame = false;
            return stopGame;
        }
    }
    public static void gameLoop() {
        String[] players = Player.startGame();
        String p1,p2;
        int bal1, bal2;
        boolean run = true;
        p1 = players[0]; p2 = players[1];
        bal1 = 1000; bal2 = 1000;
        while(run) {
            bal1 = Player.playerTurn(bal1, p1);
            if(winCondition(bal1, p1) == true){
                break;
            }
            else {
                System.out.print("");
            }
            bal2 = Player.playerTurn(bal2, p2);
            if(winCondition(bal2, p2) == true) {
                break;
            }
            else {
                System.out.print("");
            }
        }
    }
}
