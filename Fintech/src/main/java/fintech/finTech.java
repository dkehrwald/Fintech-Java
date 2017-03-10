package fintech;

import fintech.accounts.Account;
import fintech.user.User;

import java.lang.reflect.Array;
import java.util.List;

/**
 * interface for FinTech demo project
 */
public interface FinTech {

    /**
     * Retrieves user by userId
     * @return {@User} users
     */
    User getUserById(int id);

    /**
     * create a new user
     * @param firstName
     * @param lastName
     * @param email
     * @param phoneNumber
     */
    void createUser(String firstName, String lastName, String email, double phoneNumber);

    /**
     * retrieves accounts linked to a specific userId
     * @param userId userId of accounts to retrieve
     * @return {@Acoount}'s linked to userId
     */
    List<Account> getAccountsByUserId(int userId);

    /**
     * create new account
     * @param user_id
     * @param account_id
     * @param account_name
     * @param type
     * @param balance
     * @param holdings
     */
    void createAccount(int user_id, int account_id, String account_name, int type, double balance, String holdings);

    /**
     * modifies an existing account
     * @param account {@Account} to modify
     * @param balance new balance to update to account
     *
     */
    void modifyAccountBalance(Account account, double balance);

    /**
     * deletes an existing account
     * @param userId userId of account to delete
     * @param accountId accountId of account to delete
     */
    void deleteAccountByUserId_AccountId(int userId, int accountId);

}
