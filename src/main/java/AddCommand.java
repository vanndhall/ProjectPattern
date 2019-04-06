import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddCommand implements Command {
    private final List<BigDecimal> ingredients;

    public AddCommand(int... arguments) {
        ingredients =
                Arrays
                        .stream(arguments)
                        .mapToObj(BigDecimal::new)
                        .collect(Collectors.toList());
    }

    public BigDecimal getResult() {
        return ingredients.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
