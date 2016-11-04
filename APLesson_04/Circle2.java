import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of your circle.");
		double r = kb.nextDouble();
		print(r, calcArea(r));
		
	}
		public static double calcArea(double r)
		{
			return 3.14 * (r * r);
		}
		
		public static void print(double r, double area)
		{
			System.out.println("The area of the circle with a radius of " + r + " is " + area);
		}
	
}
