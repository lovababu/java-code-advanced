package org.avol.java.solid.lsp;

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculatePay() {
        int workingDays = 2; // just assume.
        return salary * workingDays;
    }

    public double getBonus() {
        return calculatePay() * 0.2;
    }
}
