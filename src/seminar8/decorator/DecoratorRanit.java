package seminar8.decorator;

import seminar8.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter {
    //aici nu bagam niciun atribut in plus
    //alteram modul in care se deplaseaza

    public DecoratorRanit(ACMECaracterJoc caracterJoc) {
        super(caracterJoc);
    }

    @Override
    public void seDeplaseaza() {
        if (this.caracterJoc.getPuncteViata() < 100){
            System.out.println("Nu se mai poate deplasa. Este ranit critic");
        } else
            this.caracterJoc.seDeplaseaza();

    }
}
