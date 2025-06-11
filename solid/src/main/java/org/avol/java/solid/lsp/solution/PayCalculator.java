package org.avol.java.solid.lsp.solution;

public class PayCalculator {

    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee("a", 1000);
        employee.getBonus();

        Employee contract = new ContractEmployee("b", 12000);
        contract.getBonus();
    }
}
