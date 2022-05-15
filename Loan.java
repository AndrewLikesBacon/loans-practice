
public abstract class Loan implements LoanConstants {
	
	int number;
	String lastName;
	double amount;
	double interestRate = 0;
	int term;
	
	Loan(int num, String name, double amt, int t) {
		
		if (amt < maxLoanAmount) {
			
			number = num;
			lastName = name;
			amount = amt;
			
			if (t == mediumTerm || t == longTerm) {
				term = t;
			} else {
				term = shortTerm;
			}
			
		}
		
	}
	
	public String toString() {
		return ("Loan info: Number: " + number + " Customer last name: " + lastName + " Amount: " + amount + " Interest rate: " + String.format("%.2f", interestRate * 100) + "% Term: " + term + " years");
	}
	
	public boolean equals(Loan l) {
		
		if (number == l.number && lastName == l.lastName && amount == l.amount && interestRate == l.interestRate && term == l.term) {
			return true;
		}
		
		return false;
		
	}
}
