import java.math.BigDecimal;

public class Calculator {
    private Strategy strategy;
    public BigDecimal doOperation(int a, int b) {

        return strategy.performOperation(a,b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
