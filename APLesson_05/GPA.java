import java.util.Scanner; //import Statement
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the letter grade for your first period");
		String first = kb.nextLine();
		System.out.println("Please enter the letter grade for your second period");
		String second = kb.nextLine();
		System.out.println("Please enter the letter grade for your third period");
		String third = kb.nextLine();
		System.out.println("Please enter the letter grade for your fourth period");
		String fourth = kb.nextLine();
		System.out.println("Please enter the letter grade for your fifth period");
		String fifth = kb.nextLine();
		System.out.println("Please enter the letter grade for your sixth period");
		String sixth = kb.nextLine();
		System.out.println("Please enter the letter grade for your seventh period");
		String seventh = kb.nextLine();
		
		double gPoints = (calcPoints(first) + calcPoints(second) + calcPoints(third) + calcPoints(fourth) + calcPoints(fifth) + calcPoints(sixth) + calcPoints(seventh)) / 7; 
		System.out.println(gPoints);
	}
	
	
	public static double calcPoints(String grade)
	{
		double gradePoints = 0;
		if(grade.equals("A"))
			gradePoints = 4.0;
		if (grade.equals("B"))
			gradePoints = 3.0;
		if (grade.equals("C"))
			gradePoints = 2.0;
		if (grade.equals("D"))
			gradePoints = 1.0;
		if (grade.equals("F"))
			gradePoints = 0.0;
		
		return gradePoints;
		
	}
	
	
}

