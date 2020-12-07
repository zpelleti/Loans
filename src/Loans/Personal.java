package Loans;

public class Personal extends Loan {

	public Personal(int loanNum, String lastName, double loanAmt, int loanTerm, double currIntRate) {
		
		super(loanNum, lastName, loanAmt, loanTerm);
		setIntRate(currIntRate + (currIntRate * 0.02));
		
	}

	
}
