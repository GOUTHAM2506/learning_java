import java.util.Scanner;
class DecimalToBinary
{
	static Scanner sc = new Scanner(System.in);
	
	public static int binary(int n)
	{
		int sum = 0;
		int mul = 1;
		while(n>0)
		{
			int r = n % 2;
			sum += r*mul;
			mul *= 10;
			n/=2;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Binary value of "+n+" is "+binary(n));
	}
}
