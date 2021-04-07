package seminar7.simpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        //var proasta
//        SuperErouAbstract superErou =
//                new CaracterDisney("Mickey Mouse", 100, false);
//
//        superErou = new CaracterMarvel("Spiderman", 150, 50);
//        superErou = new CaracterDCComics("Batman", 150);

        //varianta refactorizata
        SuperErouAbstract superCaracter =
                FactorySuperErou.getSuperErou(TipCaracter.DISNEY, "Mickey Mouse");

        superCaracter = FactorySuperErou.getSuperErou(TipCaracter.MARVEL, "Spiderman");
        superCaracter = FactorySuperErou.getSuperErou(TipCaracter.DC, "Batman");


    }
}
