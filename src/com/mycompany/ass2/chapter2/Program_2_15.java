/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_2_15 
{
	public static void main (String [] args) 
	{
        Scanner value = new Scanner (System.in);
         
        int num1;
        int num2;
        int add;
        int difference;
        int product;
        int division;
         
        System.out.println ("Enter Your First Number");
        num1 = value.nextInt();
        System.out.println ("Enter Your Second Number");
        num2 = value.nextInt();
         
        add = num1 + num2;
        difference = num1 - num2;
        product = num1*num2;
        division = num1/num2;
         
        System.out.printf ("The Results Are: \nAddition = %d\nDifference = %d" + "\nProduct = %d\nQuotient = %d\n", add, difference, product, division);
    }
}
