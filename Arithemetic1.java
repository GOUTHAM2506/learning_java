import java.util.Scanner;
class Arithemetic1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num2 : ");
		int b = sc.nextInt();
		System.out.println("Sum : "+(a+b)+"\nDifference : "+(a-b)+"\nProduct : "+(a*b)+"\nQuotient : "+(a/b));
	}
}
