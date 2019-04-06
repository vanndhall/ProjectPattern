import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class StrategyPatternTest {

    @Test
    public void shouldAdd() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new AddStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(1, 2);

        // then
        assertEquals(new BigDecimal("3"), decimal);
    }

    @Test
    public void shouldSubstract() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new SubstractStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(3, 2);

        // then
        assertEquals(new BigDecimal("1"), decimal);
    }

    @Test
    public void shouldMultiply() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new MultiplicationStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(3, 2);

        // then
        assertEquals(new BigDecimal("6"), decimal);
    }

    @Test
    public void shouldDivide() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new DivisionStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(3, 2);

        // then
        assertEquals(new BigDecimal("1.5"), decimal);
    }

    @Test
    public void shouldNotFail() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new DivisionStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(3, 2);

        // then
        assertEquals(new BigDecimal("1.5"), decimal);
    }
    @Test
    public void shouldAddBig() {
        // Givent
        Calculator calculator = new Calculator();
        Strategy strategy = new DivisionStrategy();

        // When
        calculator.setStrategy(strategy);
        final BigDecimal decimal = calculator.doOperation(Integer.MAX_VALUE,Integer.MAX_VALUE);

        // then
        assertEquals(new BigDecimal(Integer.MAX_VALUE).add(new BigDecimal(Integer.MAX_VALUE)), decimal);
    }

}
