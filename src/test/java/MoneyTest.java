import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void testMultiplication() {

        Money five = Money.dollar(5);
        System.out.println(five.amount);
        Money product = five.times(3);
        System.out.println(product.getAmount());
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testMultiplicationFranc() {

        Money five = Money.dollar(5);
        five.times(2);
        Money product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5), "CHF");
        assertNotEquals(Money.franc(5), Money.franc(8));
    }


    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);

    }
}
