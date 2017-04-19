/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Dan Fulds
 *
 */
public class Program_4_fig5 
{
	public static void main(String[] args)
	{
		Program_4_fig4 account1 = new Program_4_fig4("Jane Green", 93.5);
		Program_4_fig4 account2 = new Program_4_fig4("John Blue", 72.75);
		System.out.printf("%s's letter grade is: %s%n",
		account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
		account2.getName(), account2.getLetterGrade());
	}
}
