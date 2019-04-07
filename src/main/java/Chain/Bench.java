package Chain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Bench extends AbstractChainElement {
	private final Set<String> answerPossible;

	public Bench(String... answerPossible) {
		this.answerPossible = new HashSet<>(Arrays.asList(answerPossible));
	}

	@Override
	protected Optional<Result> solveImpl(Zadanie zadanie) {
		if(answerPossible.contains(zadanie.getId())){
			return Optional.of(new Result());
		}
		return Optional.empty();
	}
}