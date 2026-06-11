//Power using method
import java.util.Scanner;
class  Power
{
	static Scanner sc = new Scanner(System.in);
	static int i = 1;
	public static int power(int a, int p)
	{
		int mul = 1;
		for(int i=1;i<=p;i++)
		{
			mul=mul*a;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		System.out.print("How many numbers you have to power : ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print("Base : ");
			int a = sc.nextInt();
			System.out.print("Power : ");
			int p = sc.nextInt();
			System.out.println("Power value : "+power(a,p));
		}
	}
}
