package fintech.user;

import java.sql.*;
import java.util.Properties;

public class UserImpl {

    /**
     * adds a new user to the database
     * @param user user to add to DB
     */
    public static void addUser(User user) {
        try {
            //connect to SQL

            /**
             * call newUser.sql
             *
             * send user.getFirstName() as (1)
             * send user.getLastName() as (2)
             * send user.getEmail() as (3)
             * send user.getPhoneNumber() as (4)
             * send user.getUserId() as (5)
             *
             */
        }
        catch(Exception e) {
            //throw exception
        }
    }

    /**
     * retrieves an existing user from the DB
     * @param userId userId of existing user
     * @return new User object
     */
    public static User retrieveUser(int userId) {
        User user = new User();

        try {
            //connect to SQL

            /**
             * call readUser.sql
             * passing in id as param 1
             *
             * create the user from the params returned
             * user.setFirstName from (1)
             * user.setLastName from (2)
             * user.setEmail from (3)
             * user.setPhoneNumber from (4)
             * user.setUserId(5)
             *
             */

        }
        catch (Exception e) {
            //throw exception
        }
        return user;
    }



}
