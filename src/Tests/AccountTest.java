package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void newBalance() {
        int baltest, balresult, roll;
        //indsæt variabler manuelt, hvad der startes med og forventes.
        baltest = 1000;
        roll = 2;
        baltest = AccountStub.newBalanceStub(baltest, roll);
        balresult = 1250;
        assertEquals(baltest, balresult, "Fejl ved test. Resultat og test ikke ens.");
    }

    @Test
    void ifNegative() {
        int test, result;
        test = -100;
        result = 0;
        test = AccountStub.ifNegativeStub(test);
        assertEquals(test, result, "Fejl ved test. Resultat og test ikke ens.");
    }
}