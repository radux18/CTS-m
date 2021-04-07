package seminar7.factoryMethod;

import seminar7.simpleFactory.SuperErouAbstract;
import seminar7.simpleFactory.TipCaracter;

public class FactoryTemaFantasy extends FactoryAbstract{

    @Override
    public SuperErouAbstract getSuperErou(TipCaracter tip, String nume) {
        SuperErouAbstract supererou = null;
        switch (tip) {
            case DISNEY:
                supererou = new CaracterFantasyDisney(nume, 100);
                break;
            case DC:
                supererou = new CaracterFantasyDCComics(nume, 500);
                break;
            case MARVEL:
                supererou = new CaracterFantasyMarvel(nume, 250);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return supererou;
    }

}
