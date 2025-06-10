package org.avol.java.solid.srp;

public interface Employee {

    /**
     * Method to calculate employee salary.
     * Actor: Account Department.
     * @param id
     *  employee id.
     */
    void calculatePay(int id);

    /**
     * Method to report employee working hours.
     * Actor: Human Resource.
     * @param id
     *  employee id.
     */
    void reportHours(int id);

    /**
     * Method to store employee information.
     * Actor: database administrators.
     * @param id
     *  employee id.
     * @param name
     *  employee name.
     * @param email
     *  employee email.
     * @param address
     *  employee address.
     * @param department
     *  employee department.
     */
    void save(int id, String name, String email, String address, String department);
}
