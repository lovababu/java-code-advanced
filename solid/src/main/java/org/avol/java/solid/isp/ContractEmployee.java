package org.avol.java.solid.isp;

/**
 * Represents a contract employee.
 * <p>
 * This class implements the EmployeePay interface and provides specific implementations
 * for calculating pay and shift allowances for contract employees. It demonstrates a violation
 * of the Interface Segregation Principle (ISP) by implementing a method that is not applicable
 * to contract employees.
 */
public class ContractEmployee implements EmployeePay {
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
    public double getPay() {
        return salary;
    }

    /**
     * Throws an exception as bonuses are not applicable to contract employees.
     *
     * @return Nothing, as this method always throws an exception.
     * @throws UnsupportedOperationException If this method is called.
     */
    @Override
    public double getBonus() {
        throw new UnsupportedOperationException("Bonus Not applicable to contract employees.");
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