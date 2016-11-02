import java.util.Random;
import java.util.Scanner;
public class Dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		System.out.println("Type: Roll");
		String roll = kb.nextLine();
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		System.out.println("You rolled a " + player);
		System.out.println("The Computer Rolled A " + computer);
		System.out.println("The winner is " + diceRoll(player, computer));
	}

	public static String diceRoll(int player, int computer)
	{
		if(player > computer)
		{
			return "player";
		}
		if(player < computer)
		{
			return "computer";
		}
		else
		{
			return "tie";
		}
	}
	
}