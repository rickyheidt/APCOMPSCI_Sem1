import java.util.Scanner;

public class CompInt
{
	public static void main(String[]args)
	{
		CompInt interest = new CompInt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter loan amount:");
		double p = kb.nextDouble();
		System.out.println("Enter the interest rate in a decimal:");
		double r = kb.nextDouble();
		System.out.println("Enter the length of the loan (Years):");
		int t = kb.nextInt();
		System.out.println("Enter the number of times the interest is compounded per year");
		int n = kb.nextInt();
		
		double MP = interest.calcMP(p, r, t , n);
		System.out.printf("Total monthly payment is $%7.2f.", MP);
	}
	
	public double calcMP(double pee, double are, int tee, int enn)
	{
		return (pee*(Math.pow((1 + (are/enn)), (enn*tee))))/(tee*12);
	}
}