import Visitor.Element;
import Visitor.Visitor;
import Visitor.Worker;
import Visitor.Company;
import Visitor.AverageSalaryVisitor;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class VisitorTest {

	@Test
	public void shouldVisitWorker() {
		final Element element = new Worker();
		final Visitor visitor = Mockito.mock(Visitor.class);

		element.accept(visitor);

		Mockito.verify(visitor).visitWorker(Mockito.any(Worker.class));
	}

	@Test
	public void shouldVisitCompany() {
		final Element element = new Company();
		final Visitor visitor = Mockito.mock(Visitor.class);

		element.accept(visitor);

		Mockito.verify(visitor).visitCompany(Mockito.any(Company.class));
	}

	@Test
	public void shouldVisitComplexStructure() {
		final Company company = new Company();
		final Worker worker1 = new Worker();
		final Worker worker2 = new Worker();
		company.add(worker1);
		company.add(worker2);

		final Visitor visitor = Mockito.mock(Visitor.class);

		company.accept(visitor);

		Mockito.verify(visitor).visitCompany(Mockito.eq(company));
		Mockito.verify(visitor).visitWorker(Mockito.eq(worker1));
		Mockito.verify(visitor).visitWorker(Mockito.eq(worker2));
	}

	@Test
	public void shouldComputeSalary() {
		final Company company = new Company();
		final Worker worker1 = new Worker(BigDecimal.valueOf(120.0));
		final Worker worker2 = new Worker(BigDecimal.valueOf(100.0));
		final Worker worker3 = new Worker(BigDecimal.valueOf(110.0));
		company.add(worker1);
		company.add(worker2);
		company.add(worker3);

		final AverageSalaryVisitor visitor = new AverageSalaryVisitor();

		company.accept(visitor);

		assertEquals(BigDecimal.valueOf(110.0), visitor.getAvgSalary());
	}
}
