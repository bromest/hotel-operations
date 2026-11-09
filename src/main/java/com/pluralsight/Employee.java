package com.pluralsight;

public class Employee {
    private String id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String id, String name, String department, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getRegularHours() {
        if (hoursWorked > 40.0) {
            return 40.0;
        }
        return hoursWorked;
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40.0) {
            return hoursWorked - 40.0;
        }
        return 0.0;
    }
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }
    @Override
    public String toString() {
        return String.format("Employee [%d]: %s (%s) | Hours: %.1f | Total Pay: $%.2f",
                id, name, department, hoursWorked, getTotalPay());
    }
}
