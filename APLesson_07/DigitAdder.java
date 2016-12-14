import java.util.Scanner;
public class DigitAdder
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number");
		int number = kb.nextInt();
		int sum = 0;
		int num = number;
		sumDigits(number, sum, num);
	}
	
	public static void sumDigits(int number, int sum, int num)
	{
		while(num > 0)
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}