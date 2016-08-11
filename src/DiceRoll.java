import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int side, die1, die2;
		char c;
		// asks user for the amount of sides for the dice to give
		System.out.println("please enter the number of sides you wish the dice will have.");
		side = s.nextInt();
		//garbage collector to get rid of inputted enter
		s.nextLine();
		do {
			/*
			 * //asks user if he actually wants to throw the dice before
			 * throwing (removed based on feedback)
			 * System.out.println("do you want to roll the dice? y/n"); c =
			 * s.nextLine().toLowerCase().charAt(0); if (c == 'n'){
			 * System.out.println("lame..."); break; }else if (c!= 'y'){
			 * System.out.println("invalid entry, lets try again."); continue; }
			 */
			die1 = Roll(side);
			die2 = Roll(side);

			System.out.println("Roll 1");
			System.out.println(die1 + "\n" + die2);
			RollChecker(die1, die2, side);

			System.out.println("do you wish to roll again? y/n");
			//checks if the user wants to continue by taking the first char in the string they enter 
			c = s.nextLine().toLowerCase().charAt(0);

		} while (c != 'n');

		s.close();
	}
// method that creates a random roll from 1 to the max number the user specified.
	public static int Roll(int side) {
		int ran;
		ran = (int) (Math.random() * side) + 1;
		return ran;
	}
// gives feedback to the user based on that their roll was
	public static void RollChecker(int a, int b, int max) {
		if (a + b == 2) {
			System.out.println("Snake eyes, thats unlucky.");
		} else if (a + b == 12) {
			System.out.println("Box cars all the way!");
		}
		if (a + b == max * 2) {
			System.out.println("thats one lucky roll right there.");
		}

	}

}
