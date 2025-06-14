/**
 * Service interface for account-related operations.
 * Follows the Single Responsibility Principle (SRP).
 */
public interface AcctService {
    /**
     * Calculates the pay for the account with the given id.
     *
     * @param id the account id
     */
    void calculatePay(int id);
}