package org.avol.java.solid.lsp.solution;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary * 0.2;
    }
}
