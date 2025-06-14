package org.avol.java.solid.isp.solution;

/**
 * Interface for contract employee pay-related operations.
 * <p>
 * This interface extends the EmployeePay interface and adds a method specific to contract employees
 * for calculating shift allowances. It adheres to the Interface Segregation Principle (ISP) by defining
 * methods relevant only to contract employees.
 */
public interface ContractEmployeePay extends EmployeePay {

    /**
     * Calculates the shift allowances for a contract employee.
     * <p>
     * This method is specific to contract employees and returns the shift allowance amount.
     *
     * @return The shift allowance amount for the contract employee as a double.
     */
    double getShiftAllowances();
}