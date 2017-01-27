import java.util.Scanner;
public class ReverseWord 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words: ");
		for(int r = 0; r < words.length; r++) 
		{
			words[r] = kb.next();
		}
		
		System.out.println("In Order...");
		for(String straight : words) 
		{
			System.out.println(straight);
		}
		System.out.println("Reversed...");
		reverse(words);
	}
	
	public static void reverse(String[] words)
	{
		for(int r = words.length-1; r >= 0; r--)
			System.out.println(words[r]);
	}
}