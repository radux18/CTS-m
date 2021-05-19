package seminar7.factoryMethod;

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


        SuperErouAbstract superCaracter = factoryCaractere.getSuperErou(TipCaracter.DISNEY, "Mickey Mouse");

        superCaracter = factoryCaractere.getSuperErou(TipCaracter.MARVEL, "Spiderman");
        superCaracter = factoryCaractere.getSuperErou(TipCaracter.DC, "Batman");

    }
}
