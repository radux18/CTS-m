package Sub2016Ex.ex2;

public class ContBancarDebit implements InterfataContBancar {

    double balanta;
    String IBAN;

    public ContBancarDebit(double balanta, String IBAN) {
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
