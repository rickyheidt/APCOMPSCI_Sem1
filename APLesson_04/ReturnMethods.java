public class ReturnMethods
{
	public static void main(String[]args)
	{
		ReturnMethods average = new ReturnMethods();
		int number1 = 7;
		int number2 = 3;
		int number3 = 17;
		double avg = average.calcAvg(number1, number2, number3);
		System.out.printf("The average is %10.2f\n", avg);
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
	
}
