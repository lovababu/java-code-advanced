package org.avol.java.solid.dip;

/**
 * Represents a full-time employee.
 * <p>
 * This class contains the details of a full-time employee, including their name and salary.
 * It provides a method to retrieve the salary of the employee.
 */
public class FullTimeEmployee {

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
    public double getSalary() {
        return salary;
    }
}