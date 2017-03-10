package fintech;

import fintech.accounts.Account;
import fintech.accounts.Accounts;
import fintech.user.User;

public abstract class finTech_impl implements finTech {

    public User getUsers() {
        User user = new User();

        return user;
    };

    public void createUser(User user) {

    };

    public void modifyUser(User user) {

    };

    public void deleteUserByUserId(int userId) {

    };

    public Accounts getAccountsByUserId(int userId) {
        Accounts accounts = new Accounts();

        return accounts;
    };

    public void createAccount(Account account) {

    };

    public void modifyAccount(Account account) {

    };

    public void deleteAccountByUserId_AccountId(int userId, int accountId) {

    };

}
