import java.util.Scanner;
class Decimal
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a decimal number: ");
		float a = sc.nextFloat();
		int b = (int)a;
		byte c = (byte)a;
		System.out.println("Int :"+b+"\nByte :"+c);
	}
}
