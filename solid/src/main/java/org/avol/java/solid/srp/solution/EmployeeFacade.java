package org.avol.java.solid.srp.solution;

/**
 * Facade class for various service classes.
 */
public class EmployeeFacade {
    private AcctService acctService;
    private HRService hrService;
    private DBService dbService;

    public EmployeeFacade() {
        //initialize above interface implementations.
    }

    public void calculatePay(int id) {
        acctService.calculatePay(id);
    }

    public void reportHours(int id) {
        hrService.reportHours(id);
    }

    public void save(String ... args) {
        dbService.save();
    }
}
