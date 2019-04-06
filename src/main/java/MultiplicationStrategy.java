import java.math.BigDecimal;

public class MultiplicationStrategy implements Strategy {
    public BigDecimal performOperation(int a, int b) {
        return BigDecimal.valueOf(a*b);
    }
}
