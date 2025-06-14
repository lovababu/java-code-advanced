package org.avol.java.solid.isp.solution;

/**
 * Represents a contract employee.
 * <p>
 * This class implements the ContractEmployeePay interface and provides specific implementations
 * for calculating pay and shift allowances for contract employees. It adheres to the Interface
 * Segregation Principle (ISP) by only implementing methods relevant to contract employees.
 */
public class ContractEmployee implements ContractEmployeePay {
    private final double salary; // The salary of the contract employee.

    /**
     * Constructs a ContractEmployee with the specified salary.
     *
     * @param salary The salary of the contract employee.
     */
    public ContractEmployee(double salary) {
        this.salary = salary;
    }

    /**
     * Calculates the base pay for the contract employee.
     *
     * @return The base pay of the contract employee as a double.
     */
    @Override
    public double calculatePay() {
        return salary;
    }

    /**
     * Calculates the shift allowances for the contract employee.
     * <p>
     * This method returns 10 days' worth of salary as shift allowances.
     *
     * @return The shift allowance amount for the contract employee as a double.
     */
    @Override
    public double getShiftAllowances() {
        return salary / 30 * 10; // 10 days' salary as allowances.
    }
}