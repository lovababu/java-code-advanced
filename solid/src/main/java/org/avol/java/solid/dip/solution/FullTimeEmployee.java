package org.avol.java.solid.dip.solution;

/**
 * Represents a full-time employee.
 * <p>
 * This class implements the Employee interface and provides details about a full-time employee,
 * including their name and salary. It adheres to the Dependency Inversion Principle (DIP) by
 * implementing the abstraction (Employee interface).
 */
public class FullTimeEmployee implements Employee {

    // The name of the full-time employee.
    String name;

    // The salary of the full-time employee.
    double salary;

    /**
     * Constructs a FullTimeEmployee with the specified name and salary.
     *
     * @param name   The name of the full-time employee.
     * @param salary The salary of the full-time employee.
     */
    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Retrieves the salary of the full-time employee.
     *
     * @return The salary of the full-time employee as a double.
     */
    @Override
    public double calculatePay() {
        int workingDays = 2;
        return salary * workingDays;
    }
}