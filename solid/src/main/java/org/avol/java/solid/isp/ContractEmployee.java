package org.avol.java.solid.isp;

public class ContractEmployee implements EmployeePay {
    private final double salary;

    public ContractEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    //When bonus not applicable for contractor, why should ContractEmployee should provide implementation.
    @Override
    public double getBonus() {
        throw new UnsupportedOperationException("Bonus Not applicable to contract employees.");
    }

    @Override
    public double getShiftAllowances() {
        return salary / 30 * 10; //10 days salary as allowances.
    }
}
