/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_4_24 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10)
		{
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			if (result == 1)
			{
				passes = passes + 1;
				studentCounter = studentCounter + 1;
			}
			else if (result == 2)
			{
				failures = failures + 1;
				studentCounter = studentCounter + 1;
			}
			else
				System.out.print("That is not a 1 or a 2. Please enter a 1 or a 2: ");
		}
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bonus to instructor!");
	}
}
