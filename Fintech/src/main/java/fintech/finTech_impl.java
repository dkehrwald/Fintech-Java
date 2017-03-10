package fintech;

import fintech.accounts.Account;
import fintech.accounts.AccountType;
import fintech.accounts.Cash;
import fintech.accounts.Debt;
import fintech.accounts.Investment;
import fintech.user.User;
import fintech.user.UserImpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public abstract class FinTech_impl implements FinTech {

    /**
     * {@inheritDoc}
     */
    public User getUserById(int id) {
        return UserImpl.retrieveUser(id);
    };

    /**
     * {@inheritDoc}
     */
    public void createUser(String firstName, String lastName, String email, double phoneNumber) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phoneNumber);
        user.setUserId(user.hashCode());

        UserImpl.addUser(user);
    };

    /**
     * {@inheritDoc}
     */
    public List<Account> getAccountsByUserId(int userId) {

        List<Account> accounts = new ArrayList<Account>();

        try {
            connectToDb();

            /**
             * pass userId as param (1) for a.user_id
             *
             *  a.account_id
             a.account_name,
             a.type,
             a.balance,
             a.holdings
             *
             * while loop through sql return { */
                Account account = createAccountByType(1); //replace 1 with a.type returned from SQL

                account.setAccountId(a.account_id);
                account.setName(a.account_name);
                account.setBalance(a.balance);
                account.setUserId(userId);

                if(a.type == AccountType.INVESTMENT) {
                    Investment investment = (Investment)account;
                    investment.setHoldings(a.holdings);
                    accounts.add(investment);
                }
                else {
                    accounts.add(account);
                }
             /* }
             *
             */

        }
        catch(Exception e) {
            //throw exception
        }

        return accounts;
    };

    /**
     * creates new account based on the type
     * @param type accountType id
     * @return new account
     */
    private Account createAccountByType(int type) {
        switch(type) {
            case 1:
                return new Investment();
            case 2:
                return new Cash();
            case 3:
                return new Debt();
            default:
                return new Account();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void createAccount(int user_id, int account_id, String account_name, int type, double balance, String holdings ) {
        try {
            connectToDb();

            /**
             * call newAccount.sql
             *
             * send user_id as (1)
             * send account_id as (2)
             * send account_name as (3)
             * send type as (4)
             * send balance as (5)
             * send holdings as (6) if exist and type === Investment
             *
             */
        }
        catch(Exception e) {
            //exception
        }
    };

    /**
     * {@inheritDoc}
     */
    public void modifyAccountBalance(Account account, double balance) {
        try {
            connectToDb();

            /**
             * call modifyAccountBalance.sql
             * send balance as (1)
             * send account.getUserId() as (2)
             */
        }
        catch(Exception e) {
            //exception handling
        }

    };

    /**
     * {@inheritDoc}
     */
    public void deleteAccountByUserId_AccountId(int userId, int accountId) {
        try {
            connectToDb();

            /**
             * call deleteAccount.sql
             * send userId as (1)
             * send accountId as (2)
             */
        }
        catch(Exception e) {
            //exception handling
        }
    };

    /**
     * connect to DB and return db connection
     * @return
     */
    private Connection connectToDb() {
        return Connection; //connect to DB and return db connection
    }

}
