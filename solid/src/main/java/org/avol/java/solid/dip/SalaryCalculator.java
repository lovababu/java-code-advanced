package org.avol.java.solid.dip;

/**
 * Represents a salary calculator.
 * <p>
 * This class is responsible for calculating the salary of a full-time employee.
 * It is tightly coupled with the FullTimeEmployee class, which violates the Dependency
 * Inversion Principle (DIP). Refactoring may be required to decouple the dependency.
 */
public class SalaryCalculator {

    private final FullTimeEmployee fullTimeEmployee; // The full-time employee whose salary is being calculated.

    /**
     * Constructs a SalaryCalculator with the specified FullTimeEmployee.
     *
     * @param fullTimeEmployee The full-time employee whose salary will be calculated.
     */
    public SalaryCalculator(FullTimeEmployee fullTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
    }

    /**
     * Calculates the salary of the full-time employee.
     *
     * @return The salary of the full-time employee as a double.
     */
    public double calculate() {
        return fullTimeEmployee.getSalary();
    }
}