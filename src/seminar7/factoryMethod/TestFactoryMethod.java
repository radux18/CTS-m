package seminar7.factoryMethod;

import seminar7.simpleFactory.FactorySuperErou;
import seminar7.simpleFactory.SuperErouAbstract;
import seminar7.simpleFactory.TipCaracter;

public class TestFactoryMethod {
    public static void main(String[] args) {

        boolean esteTemaFantasy = true;

        FactoryAbstract factoryCaractere = null;

        if (esteTemaFantasy){
            factoryCaractere = new FactoryTemaFantasy();
        } else {
            factoryCaractere = new FactoryTemaUniversala();
        }

        SuperErouAbstract superCaracter =
                FactorySuperErou.getSuperErou(TipCaracter.DISNEY, "Mickey Mouse");

        superCaracter = FactorySuperErou.getSuperErou(TipCaracter.MARVEL, "Spiderman");
        superCaracter = FactorySuperErou.getSuperErou(TipCaracter.DC, "Batman");




    }
}
