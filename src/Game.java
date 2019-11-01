public class Game {

    public static boolean winCondition(int bal, String player) {
        boolean stopGame;
        if (bal >= 3000) {
            System.out.println(player + " har vundet spillet!! ");
            System.out.println("");
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
        boolean restart = false;
        p1 = players[0]; p2 = players[1];
        bal1 = 1000; bal2 = 1000;
        while(run) {
            bal1 = Player.playerTurn(bal1, p1);
            if(winCondition(bal1, p1) == true){
                restart = restartGame();
                if(restart == true) {
                    gameLoop();
                    break;
                }
                else {
                    run = false;
                    break;
                }
            }
            else {
                System.out.print("");
            }
            bal2 = Player.playerTurn(bal2, p2);
            if(winCondition(bal2, p2) == true) {
                restart = restartGame();
                if(restart == true) {
                    gameLoop();
                    break;
                }
                else {
                    run = false;
                    break;
                }
            }
            else {
                System.out.print("");
            }
        }

    }
    public static boolean restartGame() {
        String string;
        System.out.println("Vil i starte et nyt spil? (y eller n)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        string = scan.nextLine();
        boolean bool;
        if (string.equals("y")) {
            return bool = true;
        } else {
            System.out.println("Tak for spillet!");
            return bool = false;
        }
    }
    }

