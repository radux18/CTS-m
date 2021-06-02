package seminar13.modele;

import org.junit.*;
import seminar13.exceptii.ExceptieNota;
import seminar13.exceptii.ExceptieVarsta;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class TestStudentAlteTeste {

    //Test fixture
    static Student student;
    static ArrayList<Integer> note;
    static String numeInitial;
    static int varstaInitiala;
    static int nrNoteInitiale;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        nrNoteInitiale = 3;
        Random random = new Random();
        for (int i = 0; i < nrNoteInitiale; i++){
            note.add(random.nextInt(Student.MAX_NOTA) + 1);
        }
        numeInitial = "Gigel";
        varstaInitiala = Student.MIN_VARSTA  + 1;
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{

    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial, varstaInitiala, note);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test(expected = ExceptieVarsta.class)
    public void testRangeSetVarstaMinInt() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);
    }

    @Test(expected = ExceptieVarsta.class)
    public void testRangeSetVarstaMaxInt() throws ExceptieVarsta {
        int varstaNoua = Integer.MAX_VALUE;
        student.setVarsta(varstaNoua);
    }

    @Test
    public void testBoundaryVarstaMinimaRightSetVarsta() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);

        int varstaModificata = student.getVarsta();
        assertEquals("Test pentru limita inferioara varsta", varstaNoua, varstaModificata);
    }

    @Test
    public void testBoundaryVarstaMaximaRightSetVarsta() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);

        int varstaModificata = student.getVarsta();
        assertEquals("Test pentru limita inferioara varsta", varstaNoua, varstaModificata);
    }

    @Test
    public void testReferenceSetNoteDeepCopy() throws ExceptieNota {
        //obj extern
        ArrayList<Integer> note = new ArrayList<>();
        note.add(10);
        note.add(10);
        note.add(10);
        student.setNote(note);

        int[] noteStudent = new int[student.getNrNote()];
        for (int i = 0; i < student.getNrNote(); i++){
            noteStudent[i] = student.getNota(i);
        }

        note.set(0, 5);

        //testam daca modif starea obj extern nu afecteaza obj curent
        //shallow-copy
        int[] noteStudentDupaModificare = new int[student.getNrNote()];
        for (int i = 0; i < student.getNrNote(); i++){
            noteStudentDupaModificare[i] = student.getNota(i);
        }

        assertArrayEquals("Test modificare colectie note externa obiectului", noteStudent, noteStudentDupaModificare);
    }














}