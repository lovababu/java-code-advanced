package org.avol.java.solid.dip.solution;

public class ContractEmployee implements Employee{

    String name;
    double salary;

    public ContractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
