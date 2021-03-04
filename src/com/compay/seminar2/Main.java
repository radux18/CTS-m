package com.compay.seminar2;

import com.compay.seminar2.solid.BankAccount;
import com.compay.seminar2.solid.Person;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args)  {
//        CalendarUtil cu = new CalendarUtil();
//
//        double d1 = 1.02;
//        double d2 = 0.43;
//
//        BigDecimal bg1 = new BigDecimal("1.02");
//        BigDecimal bg2= new BigDecimal("0.43");
//        System.out.println(bg1.subtract(bg2));
//
//        System.out.println(d1 - d2);
//
//        try {
//            System.out.println(cu.weekdDay(2));
//            System.out.println(cu.weekdDay2(3));
//            System.out.println(cu.weekDay3(3));
//        } catch (IncorrectDayException e) {
//            e.printStackTrace();
//        }

        BankAccount account = new BankAccount("INGB123123123", new Person("Gigel"));



    }
}
