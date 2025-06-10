package org.avol.java.solid.lsp;

import org.avol.java.solid.lsp.solution.FullTimeEmpCalculate;

public class PayCalculator {

    public float calculatePay(Calculate calculate) {
        return calculate.calculatePay();
    }

    public float calculateBonus(Calculate calculate) {
        return calculate.calculateBonus();
    }
}
