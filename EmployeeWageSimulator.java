package org.example;

public class EmployeeWageSimulator {
    public static void main(String[] args) {
        System.out.println("Wecome To Employee Wage Computation...");
        Attendance checkAttandance = new Attendance();
        while (checkAttandance.checkAttendance()) {
            System.out.println("Empoloyee is Present...");
            return;
        }
        System.out.println("Employee is Absent...");
    }
}
