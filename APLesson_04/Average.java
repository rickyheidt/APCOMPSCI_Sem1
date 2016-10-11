import java.util.Scanner;
public class Average
{
		static int num1;
		static int num2;
		static int num3;
		static int average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter a number");
		num1 = kb.nextInt();
		System.out.println("Please enter a number");
		num2 = kb.nextInt();
		System.out.println("Please enter a number");
		num3 = kb.nextInt();
		average();
		print();
	}
		public static void average()
		{
			average = (num1 + num2 + num3) / 3;
		}
		
		public static void print()
		{
			System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
		}
	
}