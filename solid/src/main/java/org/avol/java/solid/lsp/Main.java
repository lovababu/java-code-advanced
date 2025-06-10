package org.avol.java.solid.lsp;

public class Main {

    public static void main(String[] args) {

        //creating object for Full Time Employee.
        Calculate fullTime = new FullTimeEmployee();

        PayCalculator payCalculator = new PayCalculator();
        payCalculator.calculatePay(fullTime);
        payCalculator.calculateBonus(fullTime);

        //creating object for Part Time Employee.
        Calculate partTime = new PartTimeEmployee();
        payCalculator.calculatePay(partTime);
        payCalculator.calculateBonus(partTime); //Boom... it throws an error, mean we cannot substitute Calculate object with PartTimeEmployee.
                                                // even PartTimeEmployee object has implemented Calculate interface. It's a violation of LSP.
    }
}
