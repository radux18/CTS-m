package seminar6.builder;

public class TestBuilder {
    public static void main(String[] args) {

        //1. construieste obiectul
        SuperErou superErou = new SuperErou();
        //2. initializarea atributelor
        superErou.nume = "Superman";


        SuperErou superErou2 =
                new SuperErou("Batman", 100, false, false,
                        new Arma(), null, null,null);


    }
}
