import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter a number");
		double num1 = kb.nextDouble();
		System.out.println("Please enter a number");
		double num2 = kb.nextDouble();
		System.out.println("Please enter a number");
		double num3 = kb.nextDouble();
		print(num1, num2, num3,average(num1, num2, num3));
	}
		public static double average(double num1,double num2, double num3)
		{
			return (num1 + num2 + num3) / 3;
		}
		
		public static void print(double num1, double num2, double num3, double avg)
		{
			System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg);
		}
	
}