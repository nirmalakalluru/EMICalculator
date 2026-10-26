package Day4;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount: ");
		double principal= scanner.nextDouble();
		
		System.out.println("Enter interest rate: ");
		float rate = scanner.nextFloat();
		
		System.out.println("Enter number of years: ");
		int years = scanner.nextInt();
		
		int months = years*12; 
		double monthlyInterestRate = rate/(12*100);
		
		//EMI = P * r * (1 + r)^n / ((1 + r)^n - 1) 
		//r - is the monthly interest rate
		//P = principal Loan amount
		//n is the total number of payments/months.
		
		double emi = (principal*monthlyInterestRate* Math.pow(1+ monthlyInterestRate, months))
					 / (Math.pow(1+ monthlyInterestRate, months)-1);		
		System.out.println("Your monthly EMI is: "+emi);
	}

}
