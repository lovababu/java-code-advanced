package org.avol.java.solid.lsp;

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getBonus() {
        return salary * 0.2;
    }
}
