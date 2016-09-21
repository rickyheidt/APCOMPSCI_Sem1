import java.util.Scanner; //import Statement

public class customcalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for the input
		System.out.println("This Program Will Get You Average Grade On Your 1,3,5,7 Day");
		System.out.println("What is your number grade in your first period?");
		int grade1 = keyboard.nextInt();
		System.out.println("What is your number grade in your third period?");
		int grade2 = keyboard.nextInt();
		System.out.println("What is your number grade in yout fifth period?");
		int grade3 = keyboard.nextInt();
		System.out.println("What is the number grade in your seventh period?");
		int grade4 = keyboard.nextInt();
		System.out.println("Your average number garde is " + (grade1 + grade2 + grade3 + grade4) / 4);
	}
}

