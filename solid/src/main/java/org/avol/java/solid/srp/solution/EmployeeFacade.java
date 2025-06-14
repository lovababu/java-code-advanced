package org.avol.java.solid.srp.solution;

/**
 * Facade class for various service classes.
 * <p>
 * This class provides a simplified interface to interact with multiple service classes
 * (Accounting, HR, and Admin services) by delegating method calls to the respective services.
 * It adheres to the Single Responsibility Principle (SRP) by acting as a single point of interaction
 * for clients needing to perform operations related to employees.
 */
public class EmployeeFacade {
    private AcctService acctService; // Service responsible for accounting-related operations.
    private HRService hrService;    // Service responsible for HR-related operations.
    private AdminService dbService; // Service responsible for administrative operations.

    /**
     * Default constructor.
     * <p>
     * Initializes the implementations of the service interfaces.
     */
    public EmployeeFacade() {
        // Initialize the above interface implementations.
    }

    /**
     * Calculates the pay for an employee.
     *
     * @param id The unique identifier of the employee whose pay is to be calculated.
     */
    public void calculatePay(int id) {
        acctService.calculatePay(id);
    }

    /**
     * Reports the working hours of an employee.
     *
     * @param id The unique identifier of the employee whose hours are to be reported.
     */
    public void reportHours(int id) {
        hrService.reportHours(id);
    }

    /**
     * Saves employee-related data.
     *
     * @param args Optional arguments for saving data.
     */
    public void save(String... args) {
        dbService.save();
    }
}