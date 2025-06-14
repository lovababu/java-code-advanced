package org.avol.java.solid.dip.solution;

/**
 * Represents a salary calculator.
 * <p>
 * This class is responsible for calculating the salary of an employee.
 * It adheres to the Dependency Inversion Principle (DIP) by depending on the 
 * abstraction (Employee interface) rather than a concrete implementation.
 */
public class SalaryCalculator {

    private final Employee employee; // The employee whose salary is being calculated.

    /**
     * Constructs a SalaryCalculator with the specified Employee.
     * <p>
     * This constructor allows the SalaryCalculator to work with any implementation
     * of the Employee interface, promoting loose coupling.
     *
     * @param employee The employee whose salary will be calculated.
     */
    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    /**
     * Calculates the salary of the employee.
     *
     * @return The salary of the employee as a double.
     */
    public double calculate() {
        return employee.calculatePay();
    }
}