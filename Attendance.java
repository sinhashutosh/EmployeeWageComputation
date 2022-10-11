package org.example;

import java.util.Random;

public class Attendance implements Functions {
    final private int isAbsent = 0;
    final int worked_full_time = 1;
    final int worked_part_time = 2;
    int totalWage = 0;
    final int wage_per_hour = 20;
    final int full_day_hour = 8;
    final int part_time_hour = 4;
    int day = 1;
    int total_hour = 0;
    Random rd = new Random();

    @Override
    public void checkAttendance() {
        while (day < 20 && total_hour < 100) {
            int work = rd.nextInt(3);
            if (work == worked_full_time) {
                day++;
                wageCalculator(full_day_hour * wage_per_hour);
            }
            if (work == worked_part_time) {
                total_hour += part_time_hour;
                wageCalculator(part_time_hour * wage_per_hour);
            }
//            System.out.println(day + " " + total_hour);
        }
        System.out.println("\nTotal Wage = " + totalWage);
    }

    @Override
    public void wageCalculator(int daily_wage) {
        totalWage += daily_wage;
//        System.out.println("Total Wagesss = " + totalWage);
    }
}