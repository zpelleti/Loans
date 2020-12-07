package Loans;

import java.util.Scanner;

/**
 * TO DEBUG: MAX AMOUNT CONSTANT NOT APPLIED
 * 
 * INTEREST RATE NOT APPLIED
 * 
 * VALIDATE ALL CHOICES ( TERM, P OR B )
 * 
 * @author zpell
 *
 */
public class DemoCreateLoans {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Loan[] loans = new Loan[5];

		System.out.println("Enter current interest rate:");
		double currIntRate = sc.nextDouble();

		// loop till full array :

		for (int i = 0; i < loans.length; i++) {
			System.out.println("Enter loan number :");
			int loanNum = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter last name :");
			String lastName = sc.nextLine();

			System.out.println("Enter loan amount : ");
			double loanAmt = sc.nextDouble();

			System.out.println("Enter term : (1, 3, or 5 years) ");
			int loanTerm = sc.nextInt();

			System.out.println("What type of loan? (1) personal, (2) business : ");

			int type = sc.nextInt();

			switch (type) {
			case 1:
				loans[i++] = new Personal(loanNum, lastName, loanAmt, loanTerm, currIntRate);
				break;

			case 2:
				loans[i++] = new Business(loanNum, lastName, loanAmt, loanTerm, currIntRate);
				break;
			default:
				System.out.println("Invalid type");
			}
		}
		System.out.println("\n---------Personal Loans----------");
		for (int i = 0; i < loans.length; i++) {
			if (loans[i] instanceof Personal) {
				System.out.println(loans[i]);
			}
		}
		System.out.println("\n---------Business Loans-----------");
		for (int i = 0; i < loans.length; i++) {
			if (loans[i] instanceof Business) {
				System.out.println(loans[i]);
			}
		}
	}

}
