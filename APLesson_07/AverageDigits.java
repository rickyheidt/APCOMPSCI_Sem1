import java.util.Scanner;
public class AverageDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number");
		int number = kb.nextInt();
		int digits = 0;
		int average = 0;
		sumDigits(number, sum, num);
	}
	
	public static void avDigits(int number, int digits, int average)
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += num % 10;
			num / 10;
		}
		System.out.println("The average of the digits in " + num + " is " + average);
	}
}