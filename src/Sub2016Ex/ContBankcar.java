package Sub2016Ex;

public interface ContBankcar {
    //clasa care trb adaptata la bankAccount
    public void transfer(ContBankcar destinatie, double suma);
    public void depune(double suma);
}
