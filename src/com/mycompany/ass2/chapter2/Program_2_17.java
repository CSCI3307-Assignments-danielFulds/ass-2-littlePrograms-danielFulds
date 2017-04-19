/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_2_17 
{
	public static void main (String [] args) {
        
        Scanner value = new Scanner (System.in);
         
        int num1; 
        int num2; 
        int num3; 
        int sum; 
        int average;
        int product;
        int smallest;
        int largest;
         
        System.out.print ("Enter Your First Number: ");
        num1 = value.nextInt ();
        System.out.print ("Enter Your Second Number: ");
        num2 = value.nextInt ();
        System.out.print ("Enter Your Third Number: ");
        num3 = value.nextInt ();
         
        sum = num1 + num2 + num3;
        average = (num1 + num2 + num3)/3;
        product = num1 * num2 * num3;
         
        smallest = num1; // assume smallest is the first number
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
         
        largest = num1; // assume largest is the first number
        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;
         
        System.out.printf ("\nSum = %d\nAverage = %d\nProduct = %d\nSmallest = %d\n"
                + "Largest = %d\n", sum, average, product, smallest, largest);
    }
}
