import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testUnderweight() {
        assertEquals("Underweight", BMICalculator.calculateBMI(45, 1.75));
    }

    @Test
    public void testNormalWeight() {
        assertEquals("Normal weight", BMICalculator.calculateBMI(70, 1.75));
    }

    @Test
    public void testOverweight() {
        assertEquals("Overweight", BMICalculator.calculateBMI(85, 1.75));
    }

    @Test
    public void testObesity() {
        assertEquals("Obesity", BMICalculator.calculateBMI(100, 1.75));
    }
}
