package org.avol.java.solid.lsp.solution;

public abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculatePay();

    public double getBonus() {
        return 0; // as default implementation.
    }
}
