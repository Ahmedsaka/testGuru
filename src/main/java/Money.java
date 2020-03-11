public class Money implements Expression {
    private String currency;
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public String currency() {
        return currency;
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return currency.equals(money.currency())
                && money.amount == amount; //This line is added due to inheritance property
    }

    public int getAmount() {
        return amount;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, this.currency);
    }

    public Expression plus(Money money) {
        return new Money(amount + money.amount, this.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
