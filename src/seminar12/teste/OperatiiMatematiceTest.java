package seminar12.teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import seminar12.Exceptii.ExceptieImpartireLaZero;
import seminar12.Modele.OperatiiMatematice;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OperatiiMatematiceTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Pregatire test");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Stergere resurse folosite");
    }

    //afiseaza inainte si dupa ^

    @Test
    public void test(){
       // System.out.println("Test de test");
        fail("Not yet implemented");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Salut");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("La revedere");
    }

    //Se executa doar o sg data ^

    @Test
    public void testAdunaValoriPozitive(){
       // System.out.println("Test aduna");
        int a = 5;
        int b = 5;
        int rezultatAsteptat = 10;
        int rezultatCalculat = OperatiiMatematice.aduna(a, b);

        assertEquals("Suma cu numere pozitive", rezultatAsteptat, rezultatCalculat);
    }

    @Test
    public void testImpartireValorPozitive(){
        int a = 1;
        int b = 2;
        double rezultatAsteptat = 0.5;

        double rezultatCalculat = 0;

        try {
            rezultatCalculat = OperatiiMatematice.impartire(a, b);
        } catch (ExceptieImpartireLaZero e) {
            fail("Am primit exceptia, desi nu trebuia");
        }


        assertEquals("Impartire 1/2 ", rezultatAsteptat, rezultatCalculat, 0);
    }

}