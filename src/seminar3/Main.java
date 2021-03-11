package seminar3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Receivable> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        CreditBankAccount b1 = new CreditBankAccount("RFZ1223122", p1, -500);

        Person p2 = new Person("Arnold");
        DebitBankAccount b2 = new DebitBankAccount("INGB123213", p2);

        Person p3 = new Person("Van Damme");
        DebitBankAccount b3 = new DebitBankAccount("INGB3331123", p3);

        employees.put(p1, b1);
        employees.put(p2, b2);
        employees.put(p3, b3);

        for (Receivable a : employees.values()) {
            a.deposit(1000);
        }

        Map<Person, Payable> union = new HashMap<>();
        union.put(p2, (Payable) b2);
        union.put(p3, b3);

        for (Payable a : union.values()) {
            try {
                a.withdraw(10);
            } catch (InsuficientFundsException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
