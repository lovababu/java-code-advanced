package org.avol.java.solid.dip.solution;

public class FullTimeEmployee implements Employee {

    String name;
    double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary;
    }
}
