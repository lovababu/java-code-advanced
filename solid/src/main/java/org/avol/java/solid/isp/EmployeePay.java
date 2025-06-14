package org.avol.java.solid.isp;

/**
 * Interface for employee pay-related operations.
 * <p>
 * This interface defines the contract for calculating pay, bonuses, and shift allowances
 * for different types of employees. It adheres to the Interface Segregation Principle (ISP)
 * by providing methods that can be implemented selectively based on the type of employee.
 */
public interface EmployeePay {

    /**
     * Calculates the pay for an employee.
     * <p>
     * This method applies to all employees and returns the base pay.
     *
     * @return The base pay of the employee as a double.
     */
    double getPay();

    /**
     * Calculates the bonus for a full-time employee.
     * <p>
     * This method is specific to full-time employees and returns their bonus amount.
     *
     * @return The bonus amount for the full-time employee as a double.
     */
    double getBonus();

    /**
     * Calculates the shift allowances for a contract employee.
     * <p>
     * This method is specific to contract employees and returns their shift allowance amount.
     *
     * @return The shift allowance amount for the contract employee as a double.
     */
    double getShiftAllowances();
}