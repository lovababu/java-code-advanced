package org.avol.java.solid.isp;

public class FullTimeEmployee implements EmployeePay {

    private double salary;
    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    @Override
    public double getBonus() {
        return salary * 0.2;
    }

    //When it is not applicable, why should FullTimeEmployee provide implementation.
    @Override
    public double getShiftAllowances() {
        throw new UnsupportedOperationException("Shift Allowances not applicable to full time employees.");
    }
}
