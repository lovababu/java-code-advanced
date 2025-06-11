package org.avol.java.solid.dip;

public class SalaryCalculator {

    private final FullTimeEmployee fullTimeEmployee;

    //tightly coupled with FullTimeEmployee object.
    public SalaryCalculator(FullTimeEmployee fullTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
    }

    public double calculate() {
        return fullTimeEmployee.getSalary();
    }
}

