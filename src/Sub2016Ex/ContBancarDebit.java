package Sub2016Ex;

public class ContBancarDebit implements ContBankcar{

    double balanta;
    String IBAN;

    public ContBancarDebit(double balanta, String IBAN) {
        this.balanta = balanta;
        this.IBAN = IBAN;
    }

    @Override
    public void transfer(ContBankcar destinatie, double suma) {
        destinatie.depune(suma);
        this.balanta -= suma;
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
    }
}
