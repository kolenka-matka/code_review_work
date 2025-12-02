import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(15, calculator.add(10, 5));
        //TODO inser your realisation in test-method add
    @Test
    void add() {
        assertEquals(10, calculator.add(10, 0));
        assertEquals(25, calculator.add(15, 10));
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
        assertEquals(10, calculator.dif(10, 0));
        assertEquals(5, calculator.dif(15, 10));
    }

    @Test
    void div() {
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
        assertEquals(1, calculator.div(10, 10));
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
        assertEquals(0, calculator.times(10, 0));
        assertEquals(150, calculator.times(15, 10));
    }

    @Test
    void solver() {
        assertEquals(1059, calculator.add(74, 985));
        assertEquals(97428, calculator.times(1059, 92));
        assertEquals(97402, calculator.dif(97428, 26));
        assertEquals(1739, calculator.div(97402, 56));
    }
}