package org.avol.java.solid.isp.solution;

public class FullTimeEmployee implements FullTimeEmployeePay {

    private final double salary;

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
}
