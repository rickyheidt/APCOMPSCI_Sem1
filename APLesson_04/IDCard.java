import java.util.Scanner;

public class IDCard
{
	public static void  main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		IDCard id = new IDCard();
		
		System.out.println("Enter your first name:");
		String firstname = kb.next();
		System.out.println("Enter your last name:");
		String lastname = kb.next();
		System.out.println("Enter your school name:");
		String schoolname = kb.nextLine();
		String next = kb.nextLine();
		System.out.println("Enter the current year: (example: 15-16, 16-17, 17-18");
		String year = kb.nextLine();
		System.out.println("Enter your grade level:");
		String grade = kb.next();
		System.out.println("Enter your School ID number:");
		String ID = kb.next();
		
		System.out.println("   *****************************");
		ID.format(schoolname, year);
		ID.format(firstname, lastname);
		ID.format(ID, grade);
		System.out.println("   *****************************");
	}
	
	public void format(String entry1, String entry2)
	{
		System.out.printf("%15s %15s\n", entry1, entry2);
	}
}