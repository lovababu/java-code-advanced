package org.avol.java.solid.isp.solution;

/**
 * Represents a full-time employee.
 * <p>
 * This class implements the FullTimeEmployeePay interface and provides specific implementations
 * for calculating pay and bonuses for full-time employees. It adheres to the Interface Segregation
 * Principle (ISP) by only implementing methods relevant to full-time employees.
 */
public class FullTimeEmployee implements FullTimeEmployeePay {

    private final double salary; // The salary of the full-time employee.

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
    public double calculatePay() {
        int workingDays = 2;
        return salary * workingDays;
    }

    /**
     * Calculates the bonus for the full-time employee.
     *
     * @return The bonus amount for the full-time employee as a double.
     */
    @Override
    public double getBonus() {
        return calculatePay() * 0.2;
    }
}