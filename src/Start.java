public class Start {

    public static void main(String[] args) {
        System.out.println("Velkommen til spillet, vi skal starte med at høre hvad i hedder.");
        System.out.println("Spiller 1! hvad hedder du?");
        String p1 = Player.setName();
        System.out.println("Hej med dig " + p1 + "!, du er spiller 1");
        System.out.println("Spiller 2! hvad hedder du?");
        String p2 = Player.setName();
        System.out.println("Hej med dig " + p2 + "!, du er spiller 2");
        System.out.println(p1 + " vs " + p2);
        System.out.println("I starter begge med en Balance på 1000, i skal have 3000 for at vinde.");
        System.out.println("Lad spillet begynde!");
        int Balance = 1000;
        int roll = Dice.diceHit();





    }

}
