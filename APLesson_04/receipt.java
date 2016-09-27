import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		receipt Ralphs = new receipt();
		
		System.out.println("Enter the first item.");
		String item1 = kb.next();
		System.out.println("Enter the price.");
		double price1 = kb.nextDouble();
		
		System.out.println("Enter the second item.");
		String item2 = kb.next();
		System.out.println("Enter the price.");
		double price2 = kb.nextDouble();
		
		System.out.println("Enter the third item.");
		String item3 = kb.next();
		System.out.println("Enter the price.");
		double price3 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3;
		double tax = 0.08 * subtotal;
		double total = subtotal + tax;
		
		System.out.println("          <<<<<<<<RECEIPT>>>>>>>>");
		Ralphs.format(item1, price1);
		Ralphs.format(item2, price2);
		Ralphs.format(item3, price3);
		System.out.println("\n");
		Ralphs.format("Subtotal", subtotal);
		Ralphs.format("Tax", tax);
		Ralphs.format("Total", total);
		System.out.println("\n     Thank you for shopping at Ralphs");

	}
	
	public void format(String item, double price)
	{
		System.out.printf("%15s .........     %2.2f\n", item, price);
	}
	
}