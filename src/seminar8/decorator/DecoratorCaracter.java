package seminar8.decorator;

import seminar8.adapter.ACMECaracterJoc;

public abstract class DecoratorCaracter extends ACMECaracterJoc{
        //e abstracta deci nu mosteneste metodele de la ACME
    ACMECaracterJoc caracterJoc = null;

    public DecoratorCaracter(ACMECaracterJoc caracterJoc) {
        this.caracterJoc = caracterJoc;
    }

    @Override
    public void seDeplaseaza() {
        this.caracterJoc.seDeplaseaza();
    }

    @Override
    public void esteLovit(int puncte) {
        this.caracterJoc.esteLovit(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.caracterJoc.seVindeca(puncte);
    }

}
