package org.example;

import java.util.Random;

public class Attendance {
    final private int isAbsent = 0;
    final int isPresent = 1;
    Random rd = new Random();
    int toCheck = rd.nextInt(2);
    public boolean checkAttendance() {
        if (isPresent == toCheck) {
            return true;
        }
        return false;
    }
}
