package org.example;

import java.util.Random;

public class Attendance {
    final private int isAbsent = 0;
    final int isPresent = 1;
    final int wage_per_hour = 20;
    final int full_day_hour =  8;
    Random rd = new Random();
    int toCheck = rd.nextInt(2);

    public void checkAttendance() {
        if (isPresent == toCheck) {
            System.out.println("\nEmployee is Present...");
            System.out.println("Daily Wage = "+(wage_per_hour * full_day_hour));
        } else {
            System.out.println("\nEmployee is Absent...");
            System.out.println("Daily Wage = "+(wage_per_hour * 0));
        }
    }

}
