package seminar12.main;

import seminar12.Modele.OperatiiMatematice;

public class Aplicatie {
    public static void main(String[] args) {

        System.out.println("Hello. Aplicatia a pornit");

        int a = 5;
        int b = 5;
        int rezultatAsteptat = 10;
        int rezultatCalculat = OperatiiMatematice.aduna(a, b);

        if (rezultatAsteptat == rezultatCalculat){
            System.out.println("Metoda Aduna este ok");
        } else {
            System.out.println("Ne mai trebuie niste cursuri de mate");
        }




    }
}
