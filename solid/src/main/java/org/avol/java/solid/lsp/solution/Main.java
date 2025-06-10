package org.avol.java.solid.lsp.solution;

public class Main {
    public static void main(String[] args) {

        //creating object for Full Time Employee.
        FullTimeEmpCalculate fullTime = new FullTimeEmployee();

        PayCalculator payCalculator = new PayCalculator();
        payCalculator.calculatePay(fullTime);
        payCalculator.calculateBonus(fullTime);

        Calculate calculate = new PartTimeEmployee();
        payCalculator.calculatePay(calculate);
        //payCalculator.calculateBonus(calculate); //compile time error as calculateBonus() only accepts FullTimeEmpCalculate object.
    }
}
