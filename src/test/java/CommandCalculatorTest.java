import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CommandCalculatorTest {

    @Test
    public void shouldAdd() {
        // Given
        final CommandCalculator calculator = new CommandCalculator();
        final Command command = new AddCommand(1, 2, 3, 4, 5, 6, 7);

        // when
        final BigDecimal result = calculator.doOperation(command);

        // Then
        assertEquals(new BigDecimal("28"), result);
    }

    @Test
    public void shouldSubstract() {
        // Given
        final CommandCalculator calculator = new CommandCalculator();
        final Command command = new SubstractCommand(7, 1);

        // when
        final BigDecimal result = calculator.doOperation(command);

        // Then
        assertEquals(new BigDecimal("6"), result);

    }
}
