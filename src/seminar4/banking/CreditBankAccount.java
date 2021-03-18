package seminar4.banking;

public class CreditBankAccount extends BankAccount implements Receivable {

    public CreditBankAccount(NotificationService ns, String iban, Person accountHolder, long balance) {
        super(ns);
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }



    public static CreditBankAccount createCreditBankAccount(NotificationService ns, String iban, Person accountHolder, long balance){
        return new CreditBankAccount(ns, iban, accountHolder, balance);
    }

    @Override
    public void deposit(long amount) {
        notificationService.sendNotification(accountHolder,"Adding " + amount + "to " + iban );
        this.balance += amount;
    }


    public static CreditBankAccount createCreditBankAccount(NotificationService ns, String iban, Person accountHloder) {
       return new  CreditBankAccount(ns, iban , accountHloder, 0);
    }


}
