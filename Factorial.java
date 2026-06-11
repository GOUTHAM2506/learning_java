import java.util.Scanner;
class Factorial
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		long fac = 1;
		for (int i=1;i<=n;i++)
		{
			fac*=i;
		}
		System.out.println("Factorial of "+n+" is : "+fac);
	}
}
