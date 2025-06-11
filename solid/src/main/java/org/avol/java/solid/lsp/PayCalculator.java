package org.avol.java.solid.lsp;

public class PayCalculator {

    public static void main(String[] args) {
        Employee employee = new Employee("Avol", 13000);
        System.out.println(employee.getBonus()); //it returns bonus.

        //Violates Liskov Substitution principle.
        Employee contractor = new Contractor("Avol", 12000);
        System.out.println(contractor.getBonus()); //it throws an exception, breaking the behavior. Hence, we cannot replace parent with subclass.
    }
}
