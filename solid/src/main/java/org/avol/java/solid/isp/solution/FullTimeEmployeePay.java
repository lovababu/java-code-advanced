package org.avol.java.solid.isp.solution;

public interface FullTimeEmployeePay extends EmployeePay {

    /**
     * Applies to only Full time employee.
     * @return
     *  double.
     */
    double getBonus();
}
