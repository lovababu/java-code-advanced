package org.avol.java.solid.isp.solution;

public interface ContractEmployeePay extends EmployeePay {

    /**
     * Applies to only Contract Employees.
     * @return
     *  double.
     */
    double getShiftAllowances();
}
