public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 2;
		int num2 = 4;
		int num3 = 5;
		int num4 = 6;
		int multi1 = num1 * num2;
		int multi2 = num3 * num4;
		System.out.println("2 muliplied by 4 is" + " " + multi1);
		System.out.println("5 multiplied by 6 is" + " " + multi2);
		
		String address;
		String name;
		String city;
		String zip;
		zip = "92014";
		city = "Del Mar, CA";
		address = "288 dolphin cove court";
		name = "Ricky Heidt";
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + " " + zip);
		
		
		int l = 5;
		int w = 10;
		int h = 20;
		int SA = 2*(w*l+h*l+h*w);
		System.out.println("The surface area of my rectangle is " + SA);
		
	}
}