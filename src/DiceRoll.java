import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int side, die1, die2;
		char c;
		System.out.println("please enter the number of sides you wish the dice will have.");
		side = s.nextInt();
		s.nextLine();
		do{
			/*
			System.out.println("do you want to roll the dice? y/n");
			c = s.nextLine().toLowerCase().charAt(0);
			if (c == 'n'){
				System.out.println("lame...");
				break;
			}else if (c!= 'y'){
				System.out.println("invalid entry, lets try again.");
				continue;
			}
			*/
			die1 = Roll(side);
			die2 = Roll(side);
			
			System.out.println("Roll 1");
			System.out.println(die1 +"\n"+ die2 );
			RollChecker(die1 , die2, side);
			
			System.out.println("do you wish to roll again? y/n");
			c = s.nextLine().toLowerCase().charAt(0);
			
		}while(c!='n');
		
				
				
		s.close();
	}
	
	public static int Roll(int side){
		int ran;
		ran = (int)(Math.random() * side) +1;
		return ran;
	}
	public static void RollChecker(int a , int b, int max){
		if (a+b == 2){
			System.out.println("Snake eyes, thats unlucky.");
		}else if (a+b ==12){
			System.out.println("Box cars all the way!");
		}if (a+b == max*2){
			System.out.println("thats one lucky roll right there.");
		}
		
	}

}
