/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author Dan Fulds
 *
 */
public class Program_3_11 
{
	private double balance;
	 
    public Program_3_11(double initialBalance) 
    {
        if (initialBalance > 0.0) 
            balance = initialBalance;
    }
     
    public void credit (double amount) 
    {
        balance = balance + amount;
    }
     
    public double getBalance () 
    {
        return balance;
    }
     
    public void debit (double amount) 
    {
        if (amount > balance)
            System.out.printf ("Debit amount exceeded account balance.\n");
        if (amount == balance)
            balance = balance - amount;
        if (amount < balance)
            balance = balance - amount;
    }
 
}
