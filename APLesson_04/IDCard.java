import java.util.Scanner;

public class IDCard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		IDCard ID = new IDCard();
		
		System.out.println("Enter your first name:");
		String first = kb.next();
		
		System.out.println("Enter your last name:");
		String last = kb.next();
		
		System.out.println("Enter your ID Number:");
		String number = kb.next();
		
		System.out.println("Enter the school:");
		kb.nextLine();
		String school = kb.nextLine();
		
		System.out.println("Enter the school year: (Ex. 14-15,16-17,");
		String year = kb.next();
		
		System.out.println("Enter subject:");
		String subject = kb.next();
		
		System.out.println("........................................");
		ID.printIDLine(school, year);
		ID.printIDLine(first, last);
		ID.printIDLine(number, subject);
		System.out.println("........................................");
	}
	
	public void printIDLine(String item1, String item2)
	{
		System.out.printf("*  %15s  %20s  *\n", item1, item2);
	}
}