package org.avol.java.solid.isp.solution;

/**
 * Interface for full-time employee pay-related operations.
 * <p>
 * This interface extends the EmployeePay interface and adds a method specific to full-time employees
 * for calculating bonuses. It adheres to the Interface Segregation Principle (ISP) by defining methods
 * relevant only to full-time employees.
 */
public interface FullTimeEmployeePay extends EmployeePay {

    /**
     * Calculates the bonus for a full-time employee.
     * <p>
     * This method is specific to full-time employees and returns their bonus amount.
     *
     * @return The bonus amount for the full-time employee as a double.
     */
    double getBonus();
}