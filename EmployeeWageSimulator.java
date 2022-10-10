package org.example;

public class EmployeeWageSimulator {
    public static void main(String[] args) {
        System.out.println("Wecome To Employee Wage Computation...");
        Attendance checkAttandance = new Attendance();
        int total_wage = checkAttandance.checkAttendance();
        System.out.println("\nTotal Wage = " + total_wage);
    }
}
