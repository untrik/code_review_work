import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(-8, calculator.add(-5, -3));
        assertEquals(7, calculator.add(10, -3));
    }

    @Test
    void dif() {
        assertEquals(13, calculator.dif(10, -3));
        assertEquals(5, calculator.dif(10, 5));
        assertEquals(-5, calculator.dif(5, 10));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
        assertEquals(-2, calculator.div(-10, 5));
        assertEquals(2, calculator.div(-10, -5));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        assertEquals(50, calculator.times(-10, -5));
        assertEquals(-50, calculator.times(10, -5));
        assertEquals(50, calculator.times(10, 5));
        assertEquals(0, calculator.times(0, 5));
    }

    @Test
    void solver() {
//        (x + 5) * 2 − (18 / 3) при x = 3
//        (3 + 5) * 2 - (18 / 3) = 10
        assertEquals(10,calculator.solver());
    }
}
