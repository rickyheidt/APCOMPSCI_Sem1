import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		l = kb.nextDouble();
		System.out.println("Enter the width rectangle:");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = l + l + w + w;
	}
	
	public static void print()
	{
		System.out.println("The perimeter of your rectangle with length " + l + " and width " + w + " is " + perimeter + ".");
	}
}