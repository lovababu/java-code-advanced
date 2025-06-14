package org.avol.java.solid.srp.solution;

/**
 * Interface for administrative operations.
 * <p>
 * This interface defines the contract for saving employee-related data.
 * It adheres to the Single Responsibility Principle (SRP) by focusing solely
 * on administrative tasks related to data persistence.
 */
public interface AdminService {

    /**
     * Saves employee-related data.
     * <p>
     * This method is responsible for persisting employee information
     * to a storage system (e.g., database, file system).
     */
    void save();
}