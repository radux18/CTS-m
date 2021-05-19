package seminar8.FacadeSpital;

import java.util.ArrayList;

public class Salon {
    int nrPaturi;

    public Salon(int paturi) {
        this.nrPaturi = paturi;
    }

    public int paturiLibere(){
        return nrPaturi;
    }
}
