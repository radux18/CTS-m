package com.company;

public class CalendarUtil {
    public String weekdDay(int day){
        if(day == 1){
            return "Sunday";
        } else if (day == 2){
            return "Monday";
        } else if (day == 3) {
            return "Tuesday";
        }else if (day == 4) {
            return "Wedsnday";
        } else if (day == 5) {
            return "Thursday";
        }else if (day == 6) {
            return "Friday";
        }else if (day == 7) {
            return "Saturday";
        }
        return null;
    }

    public String weekdDay2(int day){
        switch (day){
            case 1 :
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Friday";
            case 6 :
                return "Saturday";
            default:
                return null;
        }

    }

}
