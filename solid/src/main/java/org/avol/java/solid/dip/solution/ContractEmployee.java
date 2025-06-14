package org.avol.java.solid.dip.solution;

/**
 * Represents a contract employee.
 * <p>
 * This class implements the Employee interface and provides details about a contract employee,
 * including their name and salary. It adheres to the Dependency Inversion Principle (DIP) by
 * implementing the abstraction (Employee interface).
 */
public class ContractEmployee implements Employee {

    // The name of the contract employee.
    String name;

    // The salary of the contract employee.
    double salary;

    /**
     * Constructs a ContractEmployee with the specified name and salary.
     *
     * @param name   The name of the contract employee.
     * @param salary The salary of the contract employee.
     */
    public ContractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Retrieves the salary of the contract employee.
     *
     * @return The salary of the contract employee as a double.
     */
    @Override
    public double calculatePay() {
        int workingDays = 2;
        return salary * workingDays;
    }
}