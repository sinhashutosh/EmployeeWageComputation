package org.example;

import java.util.Random;

public class Attendance {
    final int wage_per_hour = 20;
    final int full_day_hour = 8;
    final int part_time_hour = 4;
    Random rd = new Random();
    int toCheck = rd.nextInt(3);

    public void checkAttendance() {
        switch (toCheck) {
            case 0:
                System.out.println("\nEmployee is Absent...");
                System.out.println("Daily Wage = 0");
                break;
            case 1:
                System.out.println("\nEmployee Worked Full Day...");
                System.out.println("Daily Wage = " + (wage_per_hour * full_day_hour));
                break;
            default:
                System.out.println("\nEmployee Worked Part Time...");
                System.out.println("Daily Wage =  " + (wage_per_hour * part_time_hour));
        }
    }
}
