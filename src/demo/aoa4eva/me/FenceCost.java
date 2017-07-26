package demo.aoa4eva.me;

import java.util.Scanner;

public class FenceCost {
	/**
	 * This is a project to calculate the cost of a fence.
	 * The details (user requirements) are below: 
	 * 
	 * @author aoa4eva
	 * 
	 * There is no validation in this example - it does the basics, and shows you a very basic application that meets the user requirements.
	 ***/
	public static void main(String[] args) {
		
		// TODO Use these to indicate work that is to be done. 
		//Variable Declaration; 

		String customerName=null; 
		String fType=null; 		
		double fLength=0; //Assumes fractions feet will be used
		double fWidth=0; //Assumes fractions of feet will be used
		final double wFenceFoot=25; //The value will not change
		final double cFenceFoot=15; //The value will not change
		final int bldgPermit=50; //The value will not change.
		double totalFenceCost=0; 
		double fencePerimeter=0; 
		boolean shouldContinue=true;
		String chooseContinue;
		Scanner keyboard = new Scanner(System.in);

		do{
				System.out.println("Enter fence width");
				fLength = keyboard.nextDouble();
				keyboard.nextLine(); //This ensures you capture the return character when the user presses enter. Sometimes the application will skip without it.
				System.out.println("Enter fence length");
				fWidth = keyboard.nextDouble();
				keyboard.nextLine();		
				System.out.println("Enter fence type (Wooden or Chainlink)");
				fType = keyboard.nextLine();
				
				fencePerimeter = 2*fLength + 2*fWidth; 
				
				if(fType.equalsIgnoreCase("wooden"))
				{
					totalFenceCost = (fencePerimeter * wFenceFoot)+50;
				}
				if(fType.equalsIgnoreCase("chainlink"))
				{
					totalFenceCost=(fencePerimeter * cFenceFoot)+50;
				}
				
				//Receive input from user
				System.out.println("Your fence is "+fencePerimeter+" feet and is "+fType);
				System.out.println("The total cost of the fence is $"+totalFenceCost);
				System.out.println("Continue?");
				chooseContinue=keyboard.nextLine();
				if(chooseContinue.equalsIgnoreCase("y"))
				{
					shouldContinue=true;
				}
				else
				{
					shouldContinue=false;
				}
		}while(shouldContinue==true);
	}

}
