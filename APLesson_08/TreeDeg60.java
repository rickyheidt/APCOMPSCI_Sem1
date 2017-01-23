import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = kb.nextLine();
		int stop = word.length();
		int go = 0;
		tree(word, stop, go);
		
		
	}

	public static void tree(String word, int stop, int go)
	{
		if(go <= stop)
		{
			System.out.printf("\n%10s", word.substring(0, go));
			go += 1;
			tree(word,stop, go);
		}	
	}
}