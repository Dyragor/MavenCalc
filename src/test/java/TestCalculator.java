import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {
    Calculator test = new Calculator();

    @Test
    public void testSummeZweiPositive() {
        assertTrue(test.addition(5, 3) == 8);
    }

    @Test
    public void testSummeZweiNegative() {
        assertTrue(test.addition(-5, -3) == -8);
    }

    @Test
    public void testSummeZweiNull() {
        assertTrue(test.addition(0, 0) == 0);
    }
}
