package com.tw.practice;

class Holiday {
    private final String holidayName;
    private final int day;
    private final int month;

    public Holiday(String holidayName, int day, int month) {
        this.holidayName = holidayName;
        this.day = day;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getHolidayName(){
        return holidayName;
    }

    public boolean inSameMonth(Holiday holiday) {
        return this.month == holiday.getMonth();
    }

    public double avgDate(int size, Holiday[] holidays) {
        double dateSum = 0;
        for (int i = 0; i < size; i++) {
            dateSum += holidays[i].getDay();
        }
        return dateSum / size;
    }
}

public class HolidayCalender {

    public static void main(String[] args) {

        Holiday holiday1 = new Holiday("Independence day", 15, 8);
        Holiday holiday2 = new Holiday("Holi", 5, 3);
        Holiday holiday3 = new Holiday("Gudi padwa", 17, 3);

        System.out.println("Is Independence day and Holi in same month: "+holiday1.inSameMonth(holiday2));
        System.out.println("Is Holi and Gudi Padwa in same month: "+holiday2.inSameMonth(holiday3));

        Holiday[] holidayArray = {holiday1, holiday2};
        System.out.println("Average of dates of given holidays: "+holiday1.avgDate(2, holidayArray));

    }
}

