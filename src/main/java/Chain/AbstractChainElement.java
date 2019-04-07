package Chain;

import java.util.Optional;

public abstract class AbstractChainElement {
	private AbstractChainElement next;

	public void setNext(AbstractChainElement next) {
		this.next = next;
	}

	public Optional<Result> solve(Zadanie zadanie) {
		Optional<Result> myResult = solveImpl(zadanie);
		if(myResult.isPresent()){  // jezeli znamy odpoweidz odpowiadamy i zwracamy odp
			return myResult;
		}

		if(next != null){
			return next.solve(zadanie); //jeżeli znajduje się kolejna łąwka za nami to przekazujemy zadanie kolejnnej łąwce
		}
		return Optional.empty(); // jeżeli łąwki za nami nie ma, i nie znamy odpoweidzi - zwracam pustą odpowiedź.
	}

	protected abstract Optional<Result> solveImpl(Zadanie zadanie);
}
