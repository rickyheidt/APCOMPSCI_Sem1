import java.util.Scanner;
public class Count 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number you want to count up to");
		int countto = kb.nextInt();
		System.out.println("Please enter the number you want to count up by");
		int countby = kb.nextInt();
		
		for(int i = 1; i <= countto/countby; i++) 
		{
			System.out.print(countby*i + "\t");
		}
		
	}
}