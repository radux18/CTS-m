package seminar12.Modele;

import seminar12.Exceptii.ExceptieImpartireLaZero;

public class OperatiiMatematice {

    public static int aduna(int a, int b){
        return a + b;
    }

    public static double impartire(int a, int b) throws ExceptieImpartireLaZero {
        if (b == 0)
            throw new ExceptieImpartireLaZero();

            return a/b;
    }
}
