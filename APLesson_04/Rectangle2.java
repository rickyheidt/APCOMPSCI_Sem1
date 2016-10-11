import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your length: ");
		int l = kb.nextInt();
		System.out.println("Please enter your width: ");
		int w = kb.nextInt();
		print(calcPerim(l, w));
		
	}

	public static int calcPerim(int l, int w)
	{
		return 2 * (l + w);
	}
	
	public static void print(int perim)
	{
		System.out.println("Your rectangle is " + perim + " ft around.");
	}
}
