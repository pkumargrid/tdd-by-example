package guru.springframework;

public class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    protected String currency() {
        return this.currency;
    }

    public static Money franc(int amount){
        return new Money(amount,"CHF");
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.currency.equals(money.currency) && money.amount == this.amount;
    }

    public Money times(int multiplier){
        return new Money(this.amount*multiplier,this.currency);
    }
}
