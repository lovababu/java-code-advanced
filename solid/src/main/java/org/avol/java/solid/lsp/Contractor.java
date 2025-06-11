package org.avol.java.solid.lsp;

public class Contractor extends Employee {

    public Contractor(String name, double salary) {
        super(name, salary);
    }

    /**
     * Should override this method since bonus is not applicable for contractors.
     * @return
     *  double.
     */
    public double getBonus() {
        throw new UnsupportedOperationException("Bonus Not Applicable for Contractors.");
    }
}
