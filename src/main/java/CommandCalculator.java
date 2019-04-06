

import java.math.BigDecimal;

public class CommandCalculator {
    public BigDecimal doOperation(Command command) {
        if (command == null){
            throw new NullPointerException("No command provided");
        }
        return command.getResult();
    }
}

