package seminar3;

public class FeeBankAccount extends DebitBankAccount implements Receivable, Payable{

    private long fee = 2;

    public FeeBankAccount(NotificationService ns, String iBan, Person person) {
        super(ns, iBan, person);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        System.out.println("Adding " + fee + " fee to withdrawal");
        super.withdraw(amount + fee);
    }

    @Override
    public void deposit(long amount) {

    }
}
