package org.avol.java.solid.ocp;

class FullTime {
    float ctc;
    float calculate() {
        //full time employee pay calculations.
        return 0.0f;
    }
}

class PartTime {
    float hourlyPay;
    float calculate() {
        //part-time employee pay calculations.
        return 0.0f;
    }
}

public class PayCalculator {

    public float calculatePay(Object o) {
        if (o instanceof FullTime ft) {
            return ft.calculate();
        } else if (o instanceof PartTime pt) {
            return pt.calculate();
        } else {
            throw new IllegalArgumentException("Invalid Instance.");
        }
    }
}
