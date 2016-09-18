import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for the input
		System.out.println("Hello, my name is RudeAI! Im here to ask you some questions.");
		
		System.out.println("What is your name?");
		
		//search for the name that the user enters
		String name = keyboard.next();
		
		//print the results
		System.out.println(name + "?" + "! Thats a pretty average name IMO. Your parents coulda done better");
		
		System.out.println("Ok, maybe this question will be better. How old are you? ");
		
		int num = keyboard.nextInt();
		
		System.out.println("EW!!!!! " + num + "?.. Thats like the worst age you could ever be.");
		
		
		System.out.println("Well this isnt really pleasing me. Your pretty boring i would guess. What do you do for fun then " + name);
		
		String fun = keyboard.next();
		
		System.out.println("I think I would die if I did that for fun. Never heard anything sound more unentertaining before.");
		
		System.out.println("I hope your music taste is atleast good. What type of music do you listen to?");
		
		String music = keyboard.next();
		
		System.out.println("Oh my.." + music + "?!?!?!. This just keeps getting worse and worse as I ask questions. That is literally the worst genre of music out there.");
		
		System.out.println("How mnay siblings do you have? Cmon dont let me down!");
		
		int num2 = keyboard.nextInt();
		
		System.out.println("mmm, thats pretty cool... BUT!!, to bad " + num2 + " is my least favorite number... idiot." );
		
		System.out.println("Ok, maybe idiot was alittle harsh... SIKE!." + " What do/did you want to be when you grow/grew up?");
		
		String job = keyboard.next();
		
		System.out.println(job + "?.  That doesnt sound like a hard job at all. Your prob not all that smart, are you?");
		
		System.out.println("Ok " + name + ", I think ive been rude enough to you. I didnt like the name :" + name + ", I hated what you did for fun. I hated " + music + ", The number of siblings you have was my least favorite number. And finally i practically called you stupid for yor job. I just want to finish this off by saying... I was just messing around with you, no hard feelings... Right.... ");
		
	}
}