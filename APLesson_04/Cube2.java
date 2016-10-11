import java.util.Scanner;
public class Cube2
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of the cube.");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
		public static double calcSurf(double side)
		{
			return (6 * (side * side));
		}
		
		public static void print(double side, double sa)
		{
			System.out.println("The surface area of a cube whose sides are " + side + " in length is " + sa);
		}
	
}
