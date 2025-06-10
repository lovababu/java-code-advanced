package org.avol.java.solid.ocp.solution;

interface Calculate {
    float calculate();
}

class FullTime implements Calculate {
    private float ctc;

    public float calculate() {
        //full time employee pay calculations.
        return 0.0f;
    }
}

class PartTime implements Calculate {
    private float hourlyPay;
    public float calculate() {
        //part-time employee pay calculations.
        return 0.0f;
    }
}

public class PayCalculator {
    /**
     * Runtime depends on the type calculate method get invoked from respective implemented object.
     * @param calculate
     *  calculate interface type.
     * @return
     *  float.
     */
    public float calculatePay(Calculate calculate) {
        return calculate.calculate();
    }
}
