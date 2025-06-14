package org.avol.java.solid.ocp.solution;

/**
 * PayCalculator class for calculating employee pay.
 * <p>
 * This class demonstrates adherence to the Open/Closed Principle (OCP) by allowing
 * the addition of new employee types without modifying the existing code. It uses
 * the CalculatePay interface to delegate the pay calculation to the respective implementation.
 */
public class PayCalculator {
    /**
     * Runtime depends on the type calculate method get invoked from respective implemented object.
     * To support new employment type, we just have to implement CalculatePay interface to extend this method.
     * @param calculatePay
     *  calculate interface type.
     * @return
     *  float.
     */
    public float calculatePay(CalculatePay calculatePay) {
        return calculatePay.calculate();
    }
}
