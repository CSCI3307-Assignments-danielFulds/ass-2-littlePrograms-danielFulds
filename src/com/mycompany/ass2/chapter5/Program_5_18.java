/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_5_18 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		
		double amount;
		double principal = 0;
		int years = 0;
		
		System.out.printf("Enter Starting Amount: ");
		principal = input.nextInt();
		
		 System.out.printf("Enter Years Compounding: ");
		 years = input.nextInt();
		 
		 System.out.printf( "%s%20s\n", "Year", "Amount on Deposit");
		 
		 for (double rate = .05; rate <= .09; rate += .01)
		 {
			 System.out.printf("Percentage Rate %.2f\n\n", rate);
			 
			 for (int year = 1; year <= years; year++)
			 {
				 amount = principal * Math.pow(1.0 + rate, year);
				 System.out.printf("%4d%,20.2f\n", year, amount);
			 }
			 System.out.println();
		 }
	}
}
