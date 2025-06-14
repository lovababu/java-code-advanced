package org.avol.java.solid.srp.solution;

/**
 * Interface for Human Resources (HR) operations.
 * <p>
 * This interface defines the contract for HR-related tasks such as reporting working hours.
 * It adheres to the Single Responsibility Principle (SRP) by focusing solely on HR-specific operations.
 */
public interface HRService {

    /**
     * Reports the working hours of an employee.
     *
     * @param id The unique identifier of the employee whose working hours are to be reported.
     */
    void reportHours(int id);

    /**
     * Calculates the working hours of an employee.
     * <p>
     * This is a private method used internally to determine the working hours of an employee
     * based on their unique identifier.
     *
     * @param id The unique identifier of the employee.
     * @return The total working hours of the employee.
     */
    private int workingHours(int id) {
        return 0;
    }
}