package seminar13.modele;

import org.junit.*;
import seminar13.exceptii.ExceptieNume;
import seminar13.exceptii.ExceptieVarsta;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    //creem o referinta pentru a o putea apela in teste
   static Student student;
   static ArrayList<Integer> note;

   static String numeInitial = "Gigel";
   static int varstaInitiala = 21;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        note.add(9);
        note.add(10);
        note.add(8);
        //se executa o sg data inainte de toate unit testele
        //ex. conexiune la bd
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        //un fel de destructor logic
        note.clear();
        note = null;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial, varstaInitiala, note);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test(){
        fail("Not yet implemented");
    }

    @Test
    public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta {
       // int varstaNoua = 22;
        int varstaNoua = Student.MIN_VARSTA + 1;
        student.setVarsta(varstaNoua);
        assertEquals("Testare cu valori ok", varstaNoua, student.getVarsta());
        //sa verific student.getVarsta() cu varstaNoua
    }

    @Test
    public void testSetNumeRight(){
        String numeNou = "Ionel";
        try {
            student.setNume(numeNou);
            assertEquals("Test cu valori corecte", numeNou, student.getNume());
        } catch (ExceptieNume exceptieNume) {
            fail("Am primit exceptie pentru valori normale");
        }
    }

    @Test
    public void testSetVarstaErrorConditionsValoriNegative(){
        int varstaNoua = -100;
        try {
            student.setVarsta(varstaNoua);
            fail("Nu am primit exceptie pentru varsta cu valori negative");
        } catch (ExceptieVarsta exceptieVarsta) {
            assertTrue(true);
            //evalueaza testul cu true daca se duce pe exceptie
        }
        //aici dorim sa prindem eroarea
    }


    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA + 100;
        student.setVarsta(varstaNoua);

    }

}