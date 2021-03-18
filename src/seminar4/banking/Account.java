package seminar4.banking;

public interface Account {
    void withdraw(long amount) throws InsuficientFundsException;

    void deposit(long amount);
}
