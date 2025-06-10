package org.avol.java.solid.lsp.solution;

public class PayCalculator {

    public float calculatePay(Calculate calculate) {
        return calculate.calculatePay();
    }

    public float calculateBonus(FullTimeEmpCalculate calculate) {
        return calculate.calculateBonus();
    }
}
