import java.util.Scanner;

/**
 * 
 * Q5. program for rock-paper-scissors game. 
 * The user can enter "Scissors", "Rock", and "Paper". 
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-21
 *
 */

public class Q5 {
	public static void main(String args[]) {
		
		// values
		String types[] = {"rock", "scissors", "paper"};
		String userInput;
		int rand, user=0;
		boolean isValid = false;
		Scanner scanner = new Scanner(System.in);
		
		
		// Input UI
		System.out.println("Rock, Scissors, Paper! ");
		System.out.print("Please input 'scissors' or 'rock' or 'paper' >> ");
		userInput = scanner.next();
		scanner.close();
		
		// validation check
		for ( int i=0 ; i<types.length ; i++ ) {
			if ( types[i].equals(userInput) ) {
				isValid = true;
				user = i;
				break;
			}
		}
		
		// not a valid input 
		if ( ! isValid ) {
			System.out.println("Invalid Input.");
			return;
		}
		
		// computation ( random )
		rand = (int)(Math.random()*3);
		System.out.println("computer: " + types[rand]);
		
		// coumputation ( compare )
		if ( user == rand ) {
			System.out.println("DRAW");
		} else if ( (rand+1) % 3 == user  ) {
			System.out.println("LOSE...");
		} else {
			System.out.println("WIN!");
		}
	
	}
}
