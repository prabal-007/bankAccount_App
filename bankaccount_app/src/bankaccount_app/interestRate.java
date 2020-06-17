package bankaccount_app;

public interface interestRate {
	
//	method that returns the base rate
	
	default double getBaseRate() {
		return 2.5;
	}

}
