import java.math.BigDecimal;

public class SubstractCommand implements Command {
    private final BigDecimal a;
    private final BigDecimal b;

    public SubstractCommand(int a, int b) {
        this.a = BigDecimal.valueOf(a);
        this.b = BigDecimal.valueOf(b);
    }

    public BigDecimal getResult() {
        return a.subtract(b);
    }
}
