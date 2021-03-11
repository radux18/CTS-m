package seminar3;



public class FeeBankAccount extends BankAccount {

    private long fee = 2;

    public FeeBankAccount(String iBan, Person person) {
        super(iBan, person);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        System.out.println("Adding " + fee + " fee to withdrawal");
        super.withdraw(amount + fee);
    }

}
