package Sub2016Ex.ex1;

public class DebitAccount implements BankAccount {

    double value;
    int id;

    public DebitAccount(double value, int id) {
        this.value = value;
        this.id = id;
    }

    public DebitAccount() {
    }

    @Override
    public void accountTransfer(BankAccount account, double amount) {
        DebitAccount debit = (DebitAccount) account;
        debit.value += amount;
        this.value -= amount;
    }
}
