//Strong Number
import java.util.Scanner;
class StrongNum 
{
	static Scanner sc = new Scanner(System.in);
	public static void strong(int n)
	{
		int t = n;
		int sum = 0;
		while(n>0)
		{
			int ld = n%10;
			int mul = fact(ld);
			sum+=mul;
			n/=10;
		}
		if(t == sum) System.out.println(t+" is a Strong Number");
		else System.out.println(t+" is not a Strong Number");
	}
	public static int fact(int ld)
	{
		int mul = 1;
		for(int i=1;i<=ld;i++)
		{
			mul*=i;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		strong(n);
	}
}
