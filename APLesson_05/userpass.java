import java.util.Scanner;
public class userpass
{
	static String user, pass, user2, pass2;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		
		System.out.println("Please make an username");
		user = kb.nextLine();
		System.out.println("Please make a password");
		pass = kb.nextLine();
		System.out.println("<<<<<Login>>>>>");
		
		
		passCheck();
	}

	public static void passCheck()
	{
		System.out.println("Please enter your username");
		user2 = kb.nextLine();
		System.out.println("Please enter your password");
		pass2 = kb.nextLine();
		if(user.equals(user2)&& pass.equals(pass2))
			System.out.println("Access Granted!");
		
		else
		{
			if(user.equals(user2) && !pass.equals(pass2)){
				System.out.println("Your password is wrong!");
				
			}
			else if(!user.equals(user2) && pass.equals(pass2)){
				System.out.println("Your username is wrong!");
				
			}
			else{
				System.out.println("everything is wrong");
				
			}
		passCheck();
		}
			
	}
	
	
}
