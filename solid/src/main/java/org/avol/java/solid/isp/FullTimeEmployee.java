package org.avol.java.solid.isp;

/**
 * Represents a full-time employee.
 * <p>
 * This class implements the EmployeePay interface and provides specific implementations
 * for calculating pay and bonuses for full-time employees. It also demonstrates a violation
 * of the Interface Segregation Principle (ISP) by implementing a method that is not applicable
 * to full-time employees.
 */
public class FullTimeEmployee implements EmployeePay {

    private double salary; // The salary of the full-time employee.

    /**
     * Constructs a FullTimeEmployee with the specified salary.
     *
     * @param salary The salary of the full-time employee.
     */
    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    /**
     * Calculates the base pay for the full-time employee.
     *
     * @return The base pay of the full-time employee as a double.
     */
    @Override
    public double getPay() {
        return salary;
    }

    /**
     * Calculates the bonus for the full-time employee.
     *
     * @return The bonus amount for the full-time employee as a double.
     */
    @Override
    public double getBonus() {
        return salary * 0.2;
    }

    /**
     * Throws an exception as shift allowances are not applicable to full-time employees.
     *
     * @return Nothing, as this method always throws an exception.
     * @throws UnsupportedOperationException If this method is called.
     */
    @Override
    public double getShiftAllowances() {
        throw new UnsupportedOperationException("Shift Allowances not applicable to full time employees.");
    }
}