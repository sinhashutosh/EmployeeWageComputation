package org.example;
import java.util.Random;

public class Attendance {
    int totalWage = 0;
    final int wage_per_hour = 20;
    final int full_day_hour = 8;
    final int part_time_hour = 4;
    int day = 1;
    int month = 20;
    Random rd = new Random();

    public int checkAttendance() {
        while (day <= month) {
            int toCheck = rd.nextInt(3);
            day++;
            switch (toCheck) {
                case 0:
                    wageCalculator(0);
                    break;
                case 1:
                    wageCalculator(full_day_hour);
                    break;
                default:
                    wageCalculator(part_time_hour);
            }
        }
        return  totalWage;
    }

    public void wageCalculator(int attendance) {
        int dailyWage = attendance * wage_per_hour;
        totalWage += dailyWage;
    }
}