import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {
    public static String[] startGame() {
        String[] names = new String[2];
        System.out.println("Velkommen til spillet indtast jeres navn!");
        for (int i = 0; i < 2; i++) {
            System.out.println("Spiller " + (i+1) + ", hvad er dit navn?");
            Scanner scan = new Scanner(System.in);
            names[i] = scan.nextLine();
            System.out.println("Hej " + names[i] + "!");
        }
        System.out.println("Lad spillet begynde! " + names[0] + " VS " + names[1] + ".");
        System.out.println("Begge spillere starter med en balance på 1000 mønter!");
        return names;
    }

    public static String setName() {
        String name = "";
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        return name;

    }

}
