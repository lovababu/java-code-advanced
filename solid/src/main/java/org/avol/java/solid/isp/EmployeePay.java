package org.avol.java.solid.isp;

public interface EmployeePay {

    /**
     * Applies to all employees.
     * @return
     *  double.
     */
    double getPay();

    /**
     * Applies to only Full time employee.
     * @return
     *  double.
     */
    double getBonus();

    /**
     * Applies to only Contract Employees.
     * @return
     *  double.
     */
    double getShiftAllowances();
}
