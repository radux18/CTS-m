package seminar7.factoryMethod;

import seminar7.simpleFactory.*;

public class FactoryTemaUniversala extends FactoryAbstract{

    @Override
    public SuperErouAbstract getSuperErou(TipCaracter tip, String nume){
        SuperErouAbstract superErou = null;
        switch (tip){
            case DISNEY:
                superErou = new CaracterDisney(nume, 100, false);
                break;
            case DC:
                superErou = new CaracterDCComics(nume, 500, 100);
                break;
            case MARVEL:
                superErou = new CaracterMarvel(nume, 500, 0);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return superErou;
    }


}
