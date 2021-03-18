package seminar4;

import seminar4.banking.*;
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



    }
}
