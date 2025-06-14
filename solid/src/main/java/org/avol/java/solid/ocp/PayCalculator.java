package org.avol.java.solid.ocp;

/**
 * Represents a full-time employee.
 * <p>
 * This class contains attributes and methods specific to full-time employees,
 * including their cost-to-company (CTC) and pay calculation logic.
 */
class FullTimeEmployee {
    float ctc; // The cost-to-company (CTC) for the full-time employee.

    /**
     * Calculates the pay for a full-time employee.
     * <p>
     * This method contains the logic for determining the pay based on the employee's CTC.
     *
     * @return The calculated pay for the full-time employee.
     */
    float calculate() {
        // Full-time employee pay calculations.
        return 0.0f;
    }
}

/**
 * Represents a part-time employee.
 * <p>
 * This class contains attributes and methods specific to part-time employees,
 * including their hourly pay and pay calculation logic.
 */
class PartTimeEmployee
{
    float hourlyPay; // The hourly pay rate for the part-time employee.

    /**
     * Calculates the pay for a part-time employee.
     * <p>
     * This method contains the logic for determining the pay based on the employee's hourly rate.
     *
     * @return The calculated pay for the part-time employee.
     */
    float calculate() {
        // Part-time employee pay calculations.
        return 0.0f;
    }
}

/**
 * PayCalculator class for calculating employee pay.
 * <p>
 * This class demonstrates a violation of the Open/Closed Principle (OCP) by requiring
 * modification of the `calculatePay` method to support new types of employees.
 */
public class PayCalculator {

    /**
     * Calculates the pay for various types of employees.
     * <p>
     * This method determines the type of employee (full-time or part-time) and calculates their pay
     * accordingly. It violates the Open/Closed Principle because adding support for new employee types
     * requires modifying this method.
     *
     * @param o The employee object, which can be an instance of FullTime or PartTime.
     * @return The calculated pay for the employee.
     * @throws IllegalArgumentException If the provided object is not a valid employee type.
     */
    public float calculatePay(Object o) {
        if (o instanceof FullTimeEmployee ft) {
            return ft.calculate();
        } else if (o instanceof PartTime pt) {
            return pt.calculate();
        } else {
            throw new IllegalArgumentException("Invalid Instance.");
        }
    }
}