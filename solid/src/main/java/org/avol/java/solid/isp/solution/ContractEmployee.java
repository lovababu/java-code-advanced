package org.avol.java.solid.isp.solution;

public class ContractEmployee implements ContractEmployeePay {
    private final double salary;

    public ContractEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    @Override
    public double getShiftAllowances() {
        return salary / 30 * 10; //10 days salary as allowances.
    }
}
