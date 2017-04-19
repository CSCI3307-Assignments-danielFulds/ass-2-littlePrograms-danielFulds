/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_4_fig8 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		
		while (gradeCounter <= 10)
		{
			System.out.print("Enter grade: "); // prompt
			int grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1;
		}
		
		int average = total / 10; // integer division yields integer result
		
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
	}
}
