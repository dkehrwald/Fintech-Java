package fintech.accounts;

/**
 * Enumerates the various Account types
 */
public enum AccountType {
    INVESTMENT(1),
    CASH(2),
    DEBT(3);

    private final int value;

    private AccountType(final int value) { this.value = value; }

    /**
     * Get the integer value of this enum value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find the enum type by its int value.
     * @return null if the value is not found
     */
    public static AccountType findByValue(final int value) {
        switch(value) {
            case 1:
                return INVESTMENT;
            case 2:
                return CASH;
            case 3:
                return DEBT;
            default:
                return null;
        }
    }
}
