package fintech.user;


import fintech.accounts.Accounts;

public class User {
    private double userId;
    private String firstName;
    private String lastName;
    private String email;
    private double phone;
    private Accounts accounts;

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (Double.compare(user.userId, userId) != 0) return false;
        if (Double.compare(user.phone, phone) != 0) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        if (!email.equals(user.email)) return false;
        return accounts != null ? accounts.equals(user.accounts) : user.accounts == null;
    }

    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(userId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        temp = Double.doubleToLongBits(phone);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }

}
