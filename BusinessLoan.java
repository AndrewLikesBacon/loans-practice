
public class BusinessLoan extends Loan {
	
	BusinessLoan(int num, String name, double amt, int t) {
		
		super(num, name, amt, t);
		interestRate += 0.032;
		
	}
	
}
