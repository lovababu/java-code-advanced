package org.avol.java.solid.dip.solution;

public class SalaryCalculator {

    private final Employee employee;

    //loosely coupled, and can be extended to multiple employee types.
    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public double calculate() {
        return employee.getSalary();
    }
}
