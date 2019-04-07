package Visitor;

import java.math.BigDecimal;

public class Worker implements Element {

	private final BigDecimal salary;

	public Worker() {
		this(BigDecimal.ZERO);
	}

	public Worker(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitWorker(this);
	}

	public BigDecimal getSalary() {
		return salary;
	}
}
