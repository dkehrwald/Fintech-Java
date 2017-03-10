package fintech;

import fintech.accounts.Account;
import fintech.accounts.Accounts;
import fintech.user.User;

/**
 * interface for finTech demo project
 */
public interface finTech {

    /**
     * Retrieves all available users
     * @return {@User} users
     */
    User getUsers();

    /**
     * creates a new user
     * @param user
     */
    void createUser(User user);

    /**
     * modifies a {@User} by their userId
     * @param user modified User
     */
    void modifyUser(User user);

    /**
     * deletes a {@User} by their userId
     * @param userId userId of user to delete
     */
    void deleteUserByUserId(int userId);

    /**
     * retrieves accounts linked to a specific userId
     * @param userId userId of accounts to retrieve
     * @return {@Acoount}'s linked to userId
     */
    Accounts getAccountsByUserId(int userId);

    /**
     * creates a new Account
     * @param account {@Account} to create
     */
    void createAccount(Account account);

    /**
     * modifies an existing account
     * @param account {@Account} to modify
     */
    void modifyAccount(Account account);

    /**
     * deletes an existing account
     * @param userId userId of account to delete
     * @param accountId accountId of account to delete
     */
    void deleteAccountByUserId_AccountId(int userId, int accountId);

}
