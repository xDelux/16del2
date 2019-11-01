package Tests;

public class AccountStub {

    public static int newBalanceStub(int bal, int roll) {
        switch (roll) {
            case 2:
                bal += 250;
                return bal;
            case 3:
                bal -= 100;
                bal = ifNegativeStub(bal);
                return bal;
            case 4:
                bal += 100;
                return bal;
            case 5:
                bal -= 20;
                bal = ifNegativeStub(bal);
                return bal;
            case 6:
                bal += 180;
                return bal;
            case 7:
                bal = bal;
                return bal;
            case 8:
                bal -= 70;
                bal = ifNegativeStub(bal);
                return bal;
            case 9:
                bal += 60;
                return bal;
            case 10:
                bal -= 80;
                bal = ifNegativeStub(bal);
                return bal;
            case 11:
                bal -= 50;
                bal = ifNegativeStub(bal);
                return bal;
            case 12:
                bal += 650;
                return bal;
            default:
                bal += 0;
                return bal;
        }
    }

    public static int ifNegativeStub(int x) {
        if (x < 0) {
            x = 0;
            return x;
        } else {
            x = x;
            return x;
        }
    }
}