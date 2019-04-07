package Visitor;


public interface Visitor {
	void visitWorker(Worker worker);

	void visitCompany(Company company);
}