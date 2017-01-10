import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number");
		int number = kb.nextInt();
		getReverse(number);
		
	}
	
	public static void getReverse(int number)
	{
		int num = number;
		int rev = 0;
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		System.out.println(number + " reversed is " + rev);
	}
}