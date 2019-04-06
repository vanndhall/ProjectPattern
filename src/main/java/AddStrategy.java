import java.math.BigDecimal;

public class AddStrategy implements Strategy {
    public BigDecimal performOperation(int a, int b){
        return BigDecimal.valueOf(a+b);
    }
}
