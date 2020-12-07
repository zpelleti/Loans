package Loans;

import java.util.Scanner;

public class Loan implements LoansConstants {

	private int loanNum;
	private String lastName;
	private double loanAmt;
	private double intRate;
	private int loanTerm;

	Scanner sc = new Scanner(System.in);

	public Loan() {
		loanNum = 0;
		lastName = "";
		loanAmt = 0.00;
		intRate = 0.00;
		loanTerm = 0;
		
	}

	// Parameterized constructor: all parameters except int rate:
	public Loan(int loanNum, String lastName, double loanAmt, int loanTerm) {
		this.loanNum = loanNum;
		this.lastName = lastName;
		setLoanAmt(loanAmt);
		setLoanTerm(loanTerm);
	}

	

	public void setLoanAmt(double amt) {
		do {
			if (loanAmt > MAXAMT) {
				System.out.println("Error");
				System.out.println("Amount maximum is $100,000.00");
				System.out.println("Please enter loan amount: ");
				amt = sc.nextDouble();
			} else
				loanAmt = amt;
			break;
		} while (true);
	}

	public void setLoanTerm(int loanTerm) {
		do {
			if (loanTerm == LONGTERM || loanTerm == MEDTERM || loanTerm == SHORTTERM) {
				this.loanTerm = loanTerm;
				break;
			} else {
				System.out.println("Error");
				System.out.println("Must choose between 1, 3, or 5 years term");
				System.out.println("Enter loan term:");
				loanTerm = sc.nextInt();
			}
		} while (true);

	}

	public void setIntRate(double prime) {

		intRate += prime;
	}

	public int getLoanNum() {
		return loanNum;
	}

	public String getLastName() {
		return lastName;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public double getIntRate() {
		return intRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	@Override
	public String toString() {
		int c = 0;
		String display = "";
		display += "\nLoan Number: " + (c + 1) + loanNum + "\nLast Name: " + lastName + "\nLoan Amount: $" + loanAmt
				+ "\nLoan Term: ";
		if (loanTerm == SHORTTERM) {
			display += "\nshort Term - 1 year";
		} else if (loanTerm == MEDTERM) {
			display += "\nmedium Term - 3 years";
		} else if (loanTerm == LONGTERM) {
			display += "\nlong Term - 5 years";

		} else
			loanTerm = SHORTTERM;
		
		c++;
		
		return display;
	}

}
