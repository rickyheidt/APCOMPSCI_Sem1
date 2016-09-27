public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		System.out.printf("%10s  %10.2f", "test", 847893.309389);
		System.out.printf("\n%10s  %10.2f", "thisexam", 909878.00);
		String word1 = "blahh";
		double number1 = 847893.309389;
		
		form.format(word1, number1);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}

