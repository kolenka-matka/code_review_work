import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(15, calculator.add(10, 5));
        //TODO inser your realisation in test-method add
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(10, 5));
        //TODO inser your realisation in test-method dif
    }

    @Test
    void div() throws Exception {
        assertEquals(2, calculator.div(10, 5));
        assertThrows(Exception.class, () -> calculator.div(10, 0));
        //TODO inser your realisation in test-method div
    }

    @Test
    void times() {
        assertEquals(50, calculator.times(10, 5));
        //TODO inser your realisation in test-method times
    }

    @Test
    void solver() throws Exception {
        //TODO inser your realisation in test-method solver
        int result = calculator.solver();
        assertNotEquals(0, result);
        assertEquals(1, result, "fail test");
    }
}