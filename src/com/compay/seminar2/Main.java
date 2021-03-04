package com.compay.seminar2;

public class Main {
    public static void main(String[] args)  {
        CalendarUtil cu = new CalendarUtil();

        try {
            System.out.println(cu.weekdDay(9));
            System.out.println(cu.weekdDay2(3));
            System.out.println(cu.weekDay3(10));
        } catch (IncorrectDayException e) {
            e.printStackTrace();
        }


    }
}
