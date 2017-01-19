import java.util.Scanner;
public class Center

{
	static String word1;
	static String word2;
	static String word3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter Word 1: ");
		word1 = kb.nextLine();
		System.out.println("Please Enter Word 1: ");
		word2 = kb.nextLine();
		System.out.println("Please Enter Word 1: ");
		word3 = kb.nextLine();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}

	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
	}
	else
	{
		return makeCenter(" " + word + " ");
	}
}
