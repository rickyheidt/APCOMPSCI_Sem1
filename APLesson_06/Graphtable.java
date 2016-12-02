import java.util.Scanner;
public class Graphtable 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a integer");
		int num = kb.nextInt();
		System.out.println("Please enter size of table you want");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++) 
		{
			System.out.printf("%10d | %10d\n", i, (i * num));
		}
		
		System.out.println();
	}
}