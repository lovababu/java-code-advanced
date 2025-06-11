package org.avol.java.solid.lsp.solution;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return 0;
    }
}
