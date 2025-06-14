package org.avol.java.solid.lsp.solution;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        int workingDays = 2;
        return salary * workingDays;
    }

    @Override
    public double getBonus() {
        return calculatePay() * 0.2;
    }
}
