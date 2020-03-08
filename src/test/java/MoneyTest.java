import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void testMultiplication() {

        Money five = Money.dollar(5, "USD");
        System.out.println(five.amount);
        Money product = five.times(3);
        System.out.println(product.getAmount());
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5, "USD"), Money.dollar(5, "USD"));
        assertNotEquals(Money.dollar(5, "USD"), Money.dollar(8, "USD"));
        assertNotEquals(Money.dollar(5, "USD"), Money.franc(5, "CHF"));
    }

    @Test
    void testMultiplicationFranc() {

        Money five = Money.dollar(5, "USD");
        five.times(2);
        Money product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5, "CHF"), Money.franc(5, "CHF"), "CHF");
        assertNotEquals(Money.franc(5, "CHF"), Money.franc(8, "CHF"));
    }


    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1, "USD").currency());
        assertEquals("CHF", Money.franc(1, "CHF").currency());
    }
}
