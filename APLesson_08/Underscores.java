import java.util.Scanner;
public class Underscores
{
	static String sentence;
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		System.out.println(replace(kb.nextLine()));
		
	}

	public static String replace(String sentence)
	
	{
		
		if(sentence.indexOf(" ")<1)
		{
			
			return sentence;
		
		}
		else
		{
			
			return replace(sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1));
		
		}
	
	
	}
	
	
}