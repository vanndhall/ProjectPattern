package Visitor;

import java.util.HashSet;
import java.util.Set;

public class Company implements Element {
	private final Set<Worker> workers = new HashSet<>();

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCompany(this);
		workers.forEach(w -> w.accept(visitor));
	}

	public void add(Worker worker) {
		workers.add(worker);
	}
}
