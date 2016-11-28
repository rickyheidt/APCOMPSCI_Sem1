import java.util.Scanner;

public class BMIpart2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("This is a program that will calculate your BMI. Then tell you your overall condition");
		System.out.println("What is your height in inches?");
		double height = kb.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = kb.nextInt();
        double BMI = 703*(weight / (height * height));
        System.out.println("Your BMI is: " + BMI);
		calcCondish(BMI);
    }
	public static void calcCondish(double BMI)
	{
		if(BMI < 18.5){
			System.out.println("You Are Underweight");
		}
		if (BMI > 18.5 && BMI < 24.9){
			System.out.println("You Are Normal");
		}
		if (BMI > 25 && BMI < 29.9){
			System.out.println("You Are Overweight");
		}
		if (BMI > 29.9 && BMI < 34.9){
			System.out.println("You Are Obese");
		}
		if (BMI > 35 && BMI < 39.9){
			System.out.println("You Are Very Obese");
		}
		if (BMI > 39.9){
			System.out.println("You Are Morbidly Obese");
		}	
	}

}