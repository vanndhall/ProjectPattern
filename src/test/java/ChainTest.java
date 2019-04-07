import Chain.AbstractChainElement;
import Chain.Bench;
import Chain.Result;
import Chain.Zadanie;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChainTest {
	private final Zadanie zadanie1 = new Zadanie("1");
	private final Zadanie zadanie2 = new Zadanie("2");
	private final Zadanie zadanie3 = new Zadanie("3");
	private final Zadanie zadanieGw = new Zadanie("*");

	@Test
	public void shouldAnswerToTask() {
		final AbstractChainElement element = new Bench("1", "2");

		Optional<Result> result = element.solve(zadanie1);

		assertTrue(result.isPresent());
	}

	@Test
	public void shouldNotAnswerToTask() {
		final AbstractChainElement element = new Bench("1", "2");

		Optional<Result> result = element.solve(zadanieGw);

		assertFalse(result.isPresent());
	}

	@Test
	public void shouldAnswerToTaskInCooperation() {
		final AbstractChainElement bench1 = new Bench();
		final AbstractChainElement bench2 = new Bench("1");
		final AbstractChainElement bench3 = new Bench("3");
		final AbstractChainElement bench4 = new Bench("1", "2", "3", "*");
		bench1.setNext(bench2);
		bench2.setNext(bench3);
		bench3.setNext(bench4);

		assertTrue(bench1.solve(zadanie1).isPresent());
		assertTrue(bench1.solve(zadanie2).isPresent());
		assertTrue(bench1.solve(zadanie3).isPresent());
		assertTrue(bench1.solve(zadanieGw).isPresent());
	}

	@Test
	public void shouldNotAnswerToTaskInCooperation() {
		final AbstractChainElement bench1 = new Bench();
		final AbstractChainElement bench2 = new Bench("1");
		final AbstractChainElement bench3 = new Bench("3");
		final AbstractChainElement bench4 = new Bench("1", "2", "3", "*");
		bench1.setNext(bench2);
		bench2.setNext(bench3);
		bench3.setNext(bench4);

		assertFalse(bench1.solve(new Zadanie("4")).isPresent());
	}
}
