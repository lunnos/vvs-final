import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testSum() {
        CalculatorService calculator = new CalculatorService();
        long result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        CalculatorService calculator = new CalculatorService();
        long result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        CalculatorService calculator = new CalculatorService();
        long result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void testDivide() {
        CalculatorService calculator = new CalculatorService();
        String result = calculator.divide(10, 2);
        assertEquals("5", result);
    }
}

    

