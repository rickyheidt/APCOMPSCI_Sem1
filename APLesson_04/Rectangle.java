import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter length of rectangle");
		l = kb.nextDouble();
		System.out.println("Please enter width of rectangle");
		w = kb.nextDouble();
		
		
	}
}