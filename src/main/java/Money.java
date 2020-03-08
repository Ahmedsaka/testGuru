public class Money {
    private String currency;
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount, String currency) {
        return new Money(amount, currency);
    }

    public String currency() {
        return currency;
    }

    public static Money franc(int amount, String currency) {
        return new Money(amount, currency);
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && currency.equals(money.currency()); //This line is added due to inheritance property
    }

    public int getAmount() {
        return amount;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, this.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
