package com.tw.practice;

import java.util.Scanner;

public class JeevithasSalaryCalculation {
    public static final int SUNDAY = 0, SATURDAY = 6;

    public static int getSalaryForTheWeek(int[] hoursWorked) {
        int salary = 0;
        if (hoursWorked[SUNDAY] > 0) {
            salary += (hoursWorked[SUNDAY] * 100) + (0.5 * (hoursWorked[SUNDAY] * 100));
        }
        if (hoursWorked[SATURDAY] > 0) {
            salary += (hoursWorked[SATURDAY] * 100) + (0.25 * (hoursWorked[SATURDAY] * 100));
        }
        int hoursWorkedPerWeek = 0;
        for (int day = 1; day <= 5; day++) {
            salary += hoursWorked[day] * 100;
            hoursWorkedPerWeek += hoursWorked[day];
            if (hoursWorked[day] > 8) {
                if (hoursWorkedPerWeek > 40) {
                    salary += (hoursWorked[day] - 8) * 25;
                } else {
                    salary += (hoursWorked[day] - 8) * 15;
                }
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        final int totalDays = 7;

        int[] hoursPerDay = new int[totalDays];
        for (int i = 0; i < totalDays; i++) {
            hoursPerDay[i] = scannerObj.nextInt();
        }

        System.out.println("Salary for the week: " + getSalaryForTheWeek(hoursPerDay));
    }
}
