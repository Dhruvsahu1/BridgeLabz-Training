import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void additionTest() { assertEquals(15, calc.add(8, 7)); }

    @Test
    void subtractionTest() { assertEquals(1, calc.subtract(8, 7)); }

    @Test
    void multiplicationTest() { assertEquals(56, calc.multiply(8, 7)); }

    @Test
    void divisionTest() { assertEquals(2, calc.divide(8, 4)); }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
