package org.avol.java.solid.lsp.solution;

/**
 * Demonstrates the Liskov Substitution Principle (LSP) by calculating pay for different types of employees.
 * <p>
 * This class contains a main method to test the functionality of calculating total pay for employees
 * and a utility method to calculate the total pay by combining base pay and bonus.
 */
public class PayCalculator {

    /**
     * The entry point of the application.
     * <p>
     * Creates instances of different types of employees and calculates their total pay.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a full-time employee and calculate their total pay
        Employee employee = new FullTimeEmployee("a", 1000);
        System.out.println(calculateTotalPay(employee));

        // Create a contract employee and calculate their total pay
        Employee contract = new ContractEmployee("b", 12000);
        System.out.println(calculateTotalPay(contract));
    }

    /**
     * Calculates the total pay for an employee by adding their base pay and bonus.
     *
     * @param employee The employee for whom the total pay is to be calculated.
     *                 This can be any subclass of the Employee class.
     * @return The total pay for the employee, which is the sum of base pay and bonus.
     */
    public static double calculateTotalPay(Employee employee) {
        return employee.calculatePay() + employee.getBonus();
    }
}