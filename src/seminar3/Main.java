package seminar3;

public class Main {
    public static void main(String[] args)  {

        Person p = new Person("Petru");
        BankAccount account = new BankAccount("INGB123123123", p);

        account.deposit(100);
        try {
            account.withdraw(30);
            account.withdraw(40);
            account.withdraw(70);
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.getBalance());

        FeeBankAccount fb = new FeeBankAccount("INGB1232131", new Person("Gigel"));
        fb.deposit(500);
        try {
            fb.withdraw(100);
        } catch (InsuficientFundsException e) {
            e.printStackTrace();
        }
        System.out.println(fb.getBalance());
    }
}
