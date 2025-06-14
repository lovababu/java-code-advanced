package org.avol.java.solid.lsp;

/**
 * Demonstrates a violation of the Liskov Substitution Principle (LSP) in the context of employee bonus calculation.
 * <p>
 * This class contains methods to calculate total pay and highlights how substituting a subclass for a parent class
 * can lead to unexpected behavior, thereby violating LSP.
 */
public class PayCalculator {

    /**
     * The entry point of the application.
     * <p>
     * Demonstrates the behavior of calculating bonuses for different types of employees.
     * Highlights a scenario where substituting a subclass (ContractEmployee) for the parent class (Employee)
     * results in an exception, violating LSP.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a regular employee and calculate their bonus
        Employee employee = new Employee("Avol", 13000);
        calculateTotalPay(employee); // Works without any issue.

        // Create a contract employee and attempt to calculate their bonus
        // This throws an exception, breaking the expected behavior and violating LSP.
        Employee contractor = new ContractEmployee("Avol", 12000);
        calculateTotalPay(contractor);
    }

    /**
     * Calculates the total pay for an employee by adding their base pay and bonus.
     * <p>
     * This method assumes that the employee's bonus calculation is valid for all subclasses of Employee.
     * However, this assumption is violated in the case of ContractEmployee, leading to a runtime exception.
     *
     * @param employee The employee for whom the total pay is to be calculated.
     *                 This can be any subclass of the Employee class.
     * @return The total pay for the employee, which is the sum of base pay and bonus.
     */
    public static double calculateTotalPay(Employee employee) {
        return employee.calculatePay() + employee.getBonus();
    }
}