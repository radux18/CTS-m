package Sub2016Ex.ex2;

public class ContBancarCredit implements InterfataContBancar {

    double balanta;
    String IBAN;

    public ContBancarCredit(double balanta, String IBAN) {
        this.balanta = balanta;
        this.IBAN = IBAN;
    }

    @Override
    public void transfer(InterfataContBancar cont, double suma) {
        cont.depune(suma);
        this.balanta -= suma;
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
    }
}
