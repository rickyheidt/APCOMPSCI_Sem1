import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for the input
		System.out.println("How old are you?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome.");
		
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! " + teacher + " is very good!");
	}
}