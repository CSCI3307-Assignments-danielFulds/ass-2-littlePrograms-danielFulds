/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_4_20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double hours;
		double pay;
		double overtime;

		System.out.print("Enter the number of regular hours Adam Lindgren worked: ");
		hours = input.nextDouble();

		System.out.print("Enter the number of overtime hours Adam Lindgren worked: ");
		overtime = input.nextDouble();

		System.out.print("Enter the payrate of Adam Lindgren: ");
		pay = input.nextDouble();

		if (overtime == 0)
			System.out.printf("Gross pay for Adam Lindgren is %.2f\n", hours * pay);
		else
		{
			System.out.printf("Gross pay for Adam Lindgren is %.2f\n", (hours * pay) + (overtime * (pay * 1.5)));
		}
		
		System.out.print("Enter the number of regular hours Kevin Nanney worked: ");
		hours = input.nextDouble();

		System.out.print("Enter the number of overtime hours Kevin Nanney worked: ");
		overtime = input.nextDouble();

		System.out.print("Enter the payrate of Kevin Nanney: ");
		pay = input.nextDouble();

		if (overtime == 0)
			System.out.printf("Gross pay for Kevin Nanney is %.2f\n", hours * pay);
		else
		{
			System.out.printf("Gross pay for Kevin Nanney is %.2f\n", (hours * pay) + (overtime * (pay * 1.5)));
		}
		
		System.out.print("Enter the number of regular hours Joseph Marquez worked: ");
		hours = input.nextDouble();

		System.out.print("Enter the number of overtime hours Joseph Marquez worked: ");
		overtime = input.nextDouble();

		System.out.print("Enter the payrate of Joseph Marquez: ");
		pay = input.nextDouble();

		if (overtime == 0)
			System.out.printf("Gross pay for Joseph Marquez is %.2f\n", hours * pay);
		else
		{
			System.out.printf("Gross pay for Joseph Marquez is %.2f\n", (hours * pay) + (overtime * (pay * 1.5)));
		}
	}
}
