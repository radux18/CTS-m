package seminar4;

import seminar4.banking.*;
import seminar4.factory.Bank;
import seminar4.singleton.Elvis;
import java.math.BigInteger;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();

        Person p3 = new Person("Van Damme");
        p3.setEmail("van@damme.com");
        p3.setMobile("+405896563");

        CreditBankAccount b = CreditBankAccount.createCreditBankAccount(emailService, "INGB324234", p3, 100);

        CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZ2131223", p3);

        BigInteger bi = new BigInteger(24, 11, new Random());
        BigInteger bi2 = BigInteger.probablePrime(12, new Random());

        Boolean value = Boolean.FALSE;

        b.deposit(50);
        System.out.println(b.toString());


        //singleton
        Elvis elvis = Elvis.getInstance();
        elvis.sing();

        Elvis elvis2 = Elvis.getInstance();
        System.out.println(elvis == elvis2);

        ElvisV2 elvisV2 = ElvisV2.INSTANCE;
        elvisV2.sing();



        Bank bank = Bank.getInstance();

        Person adult = new Person("Van Damme");
        adult.setEmail("van@damme.com");
        adult.setMobile("+405896563");
        adult.setAge(30);
        adult.setNotificationType(Person.NotificationType.EMAIL);

        Person child = new Person("Van Damme Junior");
        child.setEmail("van@damme.com");
        child.setMobile("+405896563");
        child.setAge(14);
     //   child.setNotificationType(Person.NotificationType.SMS);

        DebitBankAccount debit1 = bank.openDebitAccount(adult);

        DebitBankAccount debit2 = bank.openDebitAccount(child);

        debit1.deposit(20);
        debit1.deposit(15);
        try {
            debit1.withdraw(15);
            debit2.withdraw(3);
        } catch (InsuficientFundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println(debit1);
        System.out.println(debit2);



    }
}
