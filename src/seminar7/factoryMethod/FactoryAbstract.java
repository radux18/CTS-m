package seminar7.factoryMethod;

import seminar7.simpleFactory.SuperErouAbstract;
import seminar7.simpleFactory.TipCaracter;

public abstract class FactoryAbstract {

    public abstract SuperErouAbstract getSuperErou(TipCaracter tip, String nume);
}
