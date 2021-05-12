package seminar11.Memento;

import java.util.Date;

public class MementoCaracterJoc {
//rol de conservare a starii
    String denumire;
    int puncteViata;
    String abilitatiMagice;

    Date momentSalvare;

    public MementoCaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
        this.denumire = denumire;
        this.puncteViata = puncteViata;
        this.abilitatiMagice = abilitatiMagice;
        momentSalvare = new Date();
    }




}
