import java.util.Scanner;
public class cube
{
	    static int side;
		static int sa;
		
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of the cube.");
		side = kb.nextInt();
		calcSurf();
		print();
	}
		public static void calcSurf()
		{
			sa = (6 * (side * side));
		}
		
		public static void print()
		{
			System.out.println("The surface area of a cube whose sides are " + side + " in length is " + sa);
		}
	
}

