import java.util.Scanner;
public class Sum
{
	static int one;
	static int two;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		one = kb.nextInt();
		System.out.println("Enter 2nd number: ");
		two = kb.nextInt();
		add();
		print();
	}
	
	public static int add ()
	{
		return one+two;
	}
	
	public static void print()
	{
		System.out.println(one + " + " + two + " = " + add());
	}
}