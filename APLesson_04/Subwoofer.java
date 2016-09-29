import java.util.Scanner;

public class Subwoofer
{
	public static void main(String[]args)
	{
		Subwoofer dimensions = new Subwoofer();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the height in inches:");
		int height = kb.nextInt();
		System.out.println("Enter the length in inches:");
		int length = kb.nextInt();
		System.out.println("Enter the width in inches:");
		int width = kb.nextInt();
		
		double vol = dimensions.calcVol(height, length, width);
		System.out.printf("The volume of your subwoofer in cubic feet is %7.2f.", vol);
	}
	
	public double calcVol(int h, int l, int w)
	{
		return (h*l*w)/1728;
	}
}