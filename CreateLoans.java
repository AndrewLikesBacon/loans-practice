import java.util.Scanner;

public class CreateLoans {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Loan[] loans = new Loan[5];
		
		System.out.println("Enter the prime interest rate as a decimal:");
		double primeInterestRate = scan.nextDouble();
		
		int type;
		int number;
		String lastName;
		double amount;
		int term;
		
		double businessTotal = 0;
		double personalTotal = 0;
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Enter the loan type (\"1\" for Business, \"2\" or any other number for Personal):");
			type = scan.nextInt();
			
			System.out.println("Enter the loan number:");
			number = scan.nextInt();
			
			System.out.println("Enter the customers last name:");
			lastName = scan.next();
			
			do {
			System.out.println("Enter the loan amount (no more than $50,000):");
			amount = scan.nextDouble();
			} while (amount > 50000);
			
			System.out.println("Enter the term:");
			term = scan.nextInt();
			
			if (type == 1) {
				
				loans[i] = new BusinessLoan(number, lastName, amount, term);
				loans[i].interestRate += primeInterestRate;
				
				businessTotal += amount;
				
			} else {
				
				loans[i] = new PersonalLoan(number, lastName, amount, term);
				loans[i].interestRate += primeInterestRate;
				
				personalTotal += amount;
				
			}
			
		}
		
		System.out.println();
		System.out.println("---Info for each loan---");
		
		for (int i=0; i<5; i++) {
			
			System.out.println();
			System.out.println("Info for loan " + (i + 1) + ":");
			System.out.println(loans[i].toString());
			System.out.println("Amount owed at the due date: " + String.format("%.2f", (loans[i].amount + loans[i].amount * loans[i].interestRate)));
			
		}
		
		System.out.println();
		System.out.println("---JPL totals---");
		System.out.println("Total loaned out in business: $" + String.format("%.2f",businessTotal));
		System.out.println("Total loaned out in personal: $" + String.format("%.2f",personalTotal));
		System.out.println("Total loaned out overall: $" + String.format("%.2f",(businessTotal + personalTotal)));
		
	}
}
