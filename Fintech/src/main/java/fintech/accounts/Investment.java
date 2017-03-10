package fintech.accounts;

public class Investment extends Account {
    private String holdings;

    public AccountType getType() {
        return AccountType.INVESTMENT;
    }

    public String getHoldings() {
        return holdings;
    }

    public void setHoldings(String holdings) {
        this.holdings = holdings;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Investment that = (Investment) o;

        return holdings != null ? holdings.equals(that.holdings) : that.holdings == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (holdings != null ? holdings.hashCode() : 0);
        return result;
    }
}
