package com.compay.seminar2;

import com.compay.seminar2.solid.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Account> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        Account b1 = new BankAccount("RFZ1223122", p1);

        Person p2 = new Person("Arnold");
        Account b2 = new FeeBankAccount("INGB123213", p2);

        Person p3 = new Person("Van Damme");
        Account b3 = new BankAccount("INGB3331123", p3);

        employees.put(p1, b1);
        employees.put(p2, b2);
        employees.put(p3, b3);

        for (Account a : employees.values()) {
            a.deposit(1000);
        }

        for (Account a : employees.values()) {
            try {
                a.withdraw(10);
            }catch (InsuficientFundsException ex){
                System.out.println(ex.getMessage());
            }

        }

    }
}
