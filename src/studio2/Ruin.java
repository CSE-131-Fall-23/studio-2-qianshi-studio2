package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int startAmount = 2;
		int winLimit = 10;
		int totalSimulations = 500;
		double winChance = 0.7;
		
		int numlose = 0;
		for (int count = 1; count <= totalSimulations; count++) {
			
			int play = 0;
			int balance = startAmount;
		    while (balance > 0 && balance < winLimit) {
		    	if (Math.random() < winChance) 
		    		balance++;
		        else 
		        	balance--;
		    	play++;
		    }
		    if (balance == winLimit) 
		    	System.out.println("Simulation: " + count + ": " + play + " WIN");
		    else {
		    	System.out.println("Simulation: " + count + ": " + play + " LOSE");
		    	numlose++;
		    }
		 }
		
		
		System.out.println("Ruin Rate from Simulation: " + numlose/500.0);
		
		if (winChance == 0.5)
		{
			double expectedRuinRate = (1 - (startAmount/winLimit));
			System.out.println("Expected Ruin Rate: " + expectedRuinRate);
		}
		else
		{
			double alpha = ((1 - winChance)/winChance);
			double expectedRuinRate = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/(1 - Math.pow(alpha, winLimit));
			System.out.println("Expected Ruin Rate: " + expectedRuinRate);
		}

	}

}
