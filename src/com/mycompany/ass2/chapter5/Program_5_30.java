/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Dan Fulds
 *
 */
import java.util.Scanner;

public class Program_5_30 
{
	private int accountNumber;
	private String makeAndModel;
	private String state;

	public Program_5_30(int accountNumber, String makeAndModel)
	{
    this.accountNumber = accountNumber;
	this.makeAndModel = makeAndModel;
	}

	public void setAccountNumber(int accountNumber)
	{
	   this.accountNumber = accountNumber;
	}

	public int getAccountNumber()
	{
	   return accountNumber;
	} 

	public void setMakeAndModel(String makeAndModel)
	{
	   this.makeAndModel = makeAndModel;
	}

	public String getMakeAndModel()
	{
	      return makeAndModel;
	} 

	public String setState(String state)
	{
		String result = ""; 
		if(state.equals("CT") || state.equals("MA") || state.equals("ME") || state.equals("NH") || state.equals("NJ") || state.equals("NY") || state.equals("PA") || state.equals("VT"))
		{
			this.state = state;
	    	result = "OK";
		}
	    else
	    {
	    	System.out.println("Sorry, this state doesn't exist");
	    	this.state = "N/A";
	    }
	    return result;
	}
	
	public String getState()
	{
		return state;
	}

	public String isNoFaultState()
	{
		String noFaultState; 
	      
	      // determine whether state has no-fault auto insurance
	      switch (getState()) // get AutoPolicy object's state abbreviation
	      {
	         case "MA": case "NJ": case "NY": case "PA":
	            noFaultState = "Yes";
	            break;
	         case "N/A":
	        	noFaultState= "Uncertain";
	        	break;
	         default:
	            noFaultState = "No";
	            break;
	      }

	      return noFaultState;
	   }
	   
	   public static void main(String[] args)
	   {
		  int accountNumber=0;
		  String makeAndModel="";
		  String state="";
	      
	      Scanner input=new Scanner(System.in);
	     while (accountNumber!=-1){
	      System.out.print("Please enter the account number(Enter -1 to exit):");
	      accountNumber=input.nextInt();
	      if(accountNumber == -1)
	    	  break;
	      System.out.print("Please enter the model:");
	      makeAndModel=input.next();
	     
	      Program_5_30 ap=new Program_5_30(accountNumber,makeAndModel);
	      
	      System.out.print("Please enter the state name:");
	      state=input.next();
	      ap.setState(state);
	      
	      policyInNoFaultState(ap);
	      }
	   }

	   // method that displays whether an AutoPolicy 
	   // is in a state with no-fault auto insurance 
	   public static void policyInNoFaultState(Program_5_30 policy)
	   {
	      System.out.println("Car insurance policy information:");
	      System.out.printf("Client #: %d Model: %s State: %n%s Whether it is no-fault state: %s%n%n",
	    	policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
	    	policy.isNoFaultState());
	   } 
}
