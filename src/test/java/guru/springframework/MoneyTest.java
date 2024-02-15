package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    public void testMultiplicationDollar(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
    }
    @Test
    public void testEqualityDollar(){
        assertEquals(Money.dollar(5),new Dollar(5,"USD"));
        assertNotEquals(Money.dollar(5),new Dollar(8,"USD"));
        assertNotEquals(Money.dollar(5),new Franc(5, "CHF"));
    }
    @Test
    public void testMultiplicationFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
    }
    @Test
    public void testEqualityFranc(){
        assertEquals(Money.franc(5),new Franc(5, "CHF"));
        assertNotEquals(Money.franc(5),new Franc(8, "CHF"));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
