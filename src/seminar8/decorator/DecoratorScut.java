package seminar8.decorator;

import seminar8.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter {

    //adaugam in plus scut
    int nivelScut;

    public DecoratorScut(ACMECaracterJoc caracterJoc, int nivel) {
        super(caracterJoc);
        this.nivelScut = nivel;
    }

    @Override
    public void esteLovit(int puncte) {
        int puncteLovitura = puncte - this.nivelScut;
        if (puncteLovitura > 0)
            super.esteLovit(puncte);
    }



}
