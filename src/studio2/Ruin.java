package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Choose your starting gamble money: ");
		int startAmount = in.nextInt();
		System.out.println("Set the win probability in decimals");
		double winChance = in.nextDouble();
		System.out.println("How much money until you stop?");
		int winLimit = in.nextInt();
		System.out.println("How many days will we simulate sir? (jarvis voice)");
		int totalSimulations = in.nextInt();
		int x = 0;
		
		for ( x = 0; x < totalSimulations; x++)
		{
			int count = 0;
		while ((startAmount > 0 ) && (startAmount <= winLimit))
		{
			double winChance1 = Math.random();
			boolean playGame = (winChance1<winChance);
			if (playGame)
			{
				startAmount++;
				count++;
			}
			else
			{
				startAmount--;
				count++;
			}

			
			// goes in for loop:
		}
		boolean success = startAmount == winLimit;
		if (success)
		{
		System.out.println("It is day " + (x+1) + " and you played " + count + " number of times. You ended in success");
		}
		else
		{ 
			System.out.println("It is day " + (x+1) + " and you played " + count + " number of times. You ended in failure");
		}
		}

	}

}
