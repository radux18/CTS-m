package seminar3;

public class BankAccount implements Account {

    private String iBan;
    private long balance;

    private Person accountHolder;

    public BankAccount(String iBan, Person person) {
        this.iBan = iBan;
        this.accountHolder = person;
        this.balance = 0;
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        if (amount > balance)
            throw  new InsuficientFundsException("Insuficient funds " + balance);
        System.out.println("withdrawing " + amount + " from " + iBan);
        balance -= amount;
    }

    @Override
    public void deposit(long amount){
        System.out.println("Adding " + amount + " to " + iBan);
        balance += amount;
    }

    public String getiBan() {
        return iBan;
    }

    public long getBalance() {
        return balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }
}
