/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_3_11_Test 
{
	public static void main (String [] args)
	{ 
		 Program_3_11 account = new Program_3_11(0.0);
		 
		 Scanner input = new Scanner (System.in);
		        
		        System.out.printf ("Your Account Balance is: $%.2f\n\n", account.getBalance());
		         
		        System.out.printf ("Enter Deposit Amount: ");
		        double depositAmount = input.nextDouble();
		         
		        System.out.printf ("\nAdding %.2f to your account balance\n\n", depositAmount);
		        account.credit(depositAmount);
		         
		        System.out.printf ("Your Account Balance is: $%.2f\n\n", account.getBalance());
		         
		        System.out.printf ("Enter Debit Amount: ");
		        double debitAmount = input.nextDouble();
		         
		        System.out.printf ("\nDebiting %.2f from your account balance\n\n", debitAmount);
		        account.debit(debitAmount);
		         
		        System.out.printf ("Your Account Balance is: $%.2f\n\n", account.getBalance());
	}
}
