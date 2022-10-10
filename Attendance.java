package org.example;

import java.util.Random;

public class Attendance {
    final private int isAbsent = 0;
    final int worked_full_time = 1;
    final int worked_part_time = 2;
    final int wage_per_hour = 20;
    final int full_day_hour = 8;
    final int part_time_hour = 4;
    Random rd = new Random();
    int toCheck = rd.nextInt(3);

    public void checkAttendance() {
        switch (toCheck) {
            case 0:
                System.out.println("\nEmployee is Absent...");
                wageCalculator(0);
                break;
            case 1:
                System.out.println("\nEmployee Worked Full Day...");
                wageCalculator(full_day_hour);
                break;
            default:
                System.out.println("\nEmployee Worked Part Time...");
                wageCalculator(part_time_hour);
        }
    }

    public void wageCalculator(int attendance) {
        System.out.println("Daily Wage = " + (attendance * wage_per_hour));
    }
}
