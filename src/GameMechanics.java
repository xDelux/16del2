import java.util.Random;

public class GameMechanics {

    public static int diceHit() {
        int diceRoll1, diceRoll2, total;
        Random rand = new Random();
        diceRoll1 = rand.nextInt(6) + 1;
        diceRoll2 = rand.nextInt(6) + 1;
        total = diceRoll1 + diceRoll2;
        return total;
    }
    public static String storyText(int roll) {
        String text;
        switch (roll) {
            case 2:
                text = "Du er ankommet til Saluzar's tårn. På toppen finder du en guldkrukke og modtager 250 mønter";
                return text;
            case 3:
                text = "Da du vandrer langs vejen, snubler du og falder ned i krateret, og taber 100 mønter på vej ned";
                return text;
            case 4:
                text = "Velkommen til Paladset port, du modtager 100 mønter som velkomstgave";
                return text;
            case 5:
                text = "Du er vandret ind i den kolde ørken, og er ved at fryse til døden." +
                        " En mand tilbyder dig et lejrbål for 20 mønter, som du køber";
                return text;
            case 6:
                text = "Velkommen til Murbyen. Du sælger her dine fundne materialer i market, " +
                        "og tjener 180 mønter.";
                return text;
            case 7:
                text = "Du er nu ankommet til Det Hellige Kloster. Mønter er ugyldige her," +
                        " derfor kan du ikke bruge mønter eller modtage.";
                return text;
            case 8:
                text = "Du er trådt ind i den Sorte Grotte. Du kan intet se, og taber 70 mønter i mørket";
                return text;
            case 9:
                text = "På toppen af dette bjerg finder du et hytte med generøse mennesker. " +
                        "Du får lov til overnatte og modtager 60 mønter";
                return text;
            case 10:
                text = "Du er stødt ind på en mur, og er nu omringet af Vareulve. " +
                        "For at slippe væk med dem, smider du 80 mønter ud i marken, s"
                        + "om de løber hen til istedet. Du får derfor en extra tur, for komme væk fra denne mur.";
                return text;
            case 11:
                text = "Du er snublet og faldet ned i det store hul." +
                        " En mand sælger stiger dernede for 50 mønter. Dette er eneste udvej";
                return text;
            case 12:
                text = "VELKOMMEN TIL GULDMINEN. Guld flyder over alt," +
                        " og du samler derfor guld op til en værdi af 650 mønter. Godt slået!";
                return text;
            default:
                text = "Fejl, ved switch case i metode storyText.";
                return text;
        }
    }
}
