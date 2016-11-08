import java.util.Scanner;
public class discount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Enter Price Of Item 1: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter Item 2: ");
		String item2 = kb.nextLine();
		System.out.println("Enter Price Of Item 2: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter Item 3: ");
		String item3 = kb.nextLine();
		System.out.println("Enter Price Of Item 3: ");
		double price3 = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter Item 4: ");
		String item4 = kb.nextLine();
		System.out.println("Enter Price Of Item 4: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = 0.08 * subtotal;
		double total = subtotal + tax - discount;
		double dissub = subtotal - discount;
		
		System.out.println("          ********RECEIPT********");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal", subtotal);
		format("Discount", discount);
		format("Discounted Subtotal", dissub);
		format("Tax", tax);
		format("Total Amount Due", total);
		System.out.println(" Thank you for shopping with us! ");
	}
	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub * 0.15;
		return 0.0;
	
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%15s ...........     %2.2f\n", item, price);
	}
}