import java.util.Scanner;
public class ModulusOperator

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter First Number");
		int one = kb.nextInt();
		System.out.println("Enter Second Number");
		int two = kb.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if(even)
			System.out.println("Your number " + (one + two) + " is even!");
		
		if(!even)
			System.out.println("Your number " + (one + two) + " is odd!");
	}
}