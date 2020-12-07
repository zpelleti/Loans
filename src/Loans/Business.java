package Loans;

public class Business extends Loan {

	public Business(int loanNum, String lastName, double loanAmt, int loanTerm, double currIntRate) {
		super(loanNum, lastName, loanAmt, loanTerm);
		setIntRate(currIntRate + (currIntRate * 0.01));
		//		setIntRate(currIntRate+ 1);

		
	}
}
