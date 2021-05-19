package seminar5Recuperare.compoziteRestaurant;

public class TestCompozite {
    public static void main(String[] args) {

        Compozite sectiune = new Compozite("bauturi");

        Compozite subsectiune = new Compozite("cafea");


        sectiune.adaugaNod(subsectiune);
        //bautura = item
        sectiune.adaugaNod(new Bautura("apa Plata", 200));


    }
}
