import java.util.Scanner;

public class Player {

     public static String setName() {
        String name = "";
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        return name;

    }
}
