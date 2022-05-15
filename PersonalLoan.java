
public class PersonalLoan extends Loan {
	
	PersonalLoan(int num, String name, double amt, int t) {
		
		super(num, name, amt, t);
		interestRate += 0.027;
		
	}
	
}
