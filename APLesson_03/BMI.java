import java.util.Scanner; //import Statement

public class BMI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for the input
		System.out.println("This is a program that will calculate your BMI.");
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextInt();
        double BMI = 703*(weight / (height * height));
        System.out.println("Your BMI is " + BMI);
    }
}