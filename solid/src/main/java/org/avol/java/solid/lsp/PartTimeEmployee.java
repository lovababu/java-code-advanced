package org.avol.java.solid.lsp;

public class PartTimeEmployee implements Calculate {
    @Override
    public float calculatePay() {
        return 0;
    }

    @Override
    public float calculateBonus() {
        //this violates LSP.
        throw new UnsupportedOperationException("Bonus Not Applicable for Part time employees.");
    }
}
