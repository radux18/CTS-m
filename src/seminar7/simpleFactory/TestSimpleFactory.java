package seminar7.simpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        //var proasta
//        SuperErouAbstract superErou =
//                new CaracterDisney("Mickey Mouse", 100, false);
//
//        superErou = new CaracterMarvel("Spiderman", 150, 50);
//        superErou = new CaracterDCComics("Batman", 150);

        boolean selectieTemaUniversala = true;

        SuperErouAbstract superCaracter = null;

        if (selectieTemaUniversala){
            //varianta refactorizata - simpleFactory
             superCaracter =
                    FactorySuperErou.getSuperErou(TipCaracter.DISNEY, "Mickey Mouse");

            superCaracter = FactorySuperErou.getSuperErou(TipCaracter.MARVEL, "Spiderman");
            superCaracter = FactorySuperErou.getSuperErou(TipCaracter.DC, "Batman");

            superCaracter.setPuncteViata(100);

        } else {
            //folosesti caractere din tema originala a jocului

        }




    }
}
