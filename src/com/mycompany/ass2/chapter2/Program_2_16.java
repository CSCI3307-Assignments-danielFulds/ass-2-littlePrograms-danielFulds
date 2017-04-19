/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_2_16 
{
	public static void main (String [] args) 
	{
        
        Scanner value = new Scanner (System.in);
         
        int num1; //first number entered by the user
        int num2; //second number entered by the user
         
        System.out.println ("Enter Your First Number");
        num1 = value.nextInt ();
        System.out.println ("Enter Your Second Number");
        num2 = value.nextInt ();
         
        System.out.println ();
         
        if (num1>num2) 
            System.out.println (num1 + " is Larger\n");
        if (num2>num1)
            System.out.println (num2 + " is Larger.\n");
        if (num1 == num2)
            System.out.println ("These numbers are equal.\n");
    }
} 
