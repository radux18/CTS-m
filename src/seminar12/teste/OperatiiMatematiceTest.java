package seminar12.teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
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
        System.out.println();
    }

    @Test
    public void test(){
        fail("Not yet implemented");
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Salut");
    }


    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("La revedere");
    }

    @Test
    public void testAdunaValoriPozitive(){
        int a = 5;
        int b = 5;
        int rezultatAsteptat = 10;
        int rezultatCalculat = OperatiiMatematice.aduna(a, b);

        assertEquals("Suma cu numere pozitive", rezultatAsteptat, rezultatCalculat);
    }

}