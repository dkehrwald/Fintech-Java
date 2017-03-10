package fintech.accounts;

public class Cash extends Account {
    public AccountType getType() {
        return AccountType.CASH;
    }
}
