package org.avol.java.solid.dip.solution;

/**
 * Represents an employee.
 * <p>
 * This interface defines the contract for an employee, requiring the implementation
 * of a method to retrieve the employee's salary. It adheres to the Dependency Inversion
 * Principle (DIP) by serving as an abstraction for different types of employees.
 */
public interface Employee {

    /**
     * Retrieves the salary of the employee.
     *
     * @return The salary of the employee as a double.
     */
    double getSalary();
}