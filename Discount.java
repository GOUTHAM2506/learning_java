import java.util.Scanner;
class Discount
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your amount : ");
		int a = sc.nextInt();
		if(a>=10000)
		{
			System.out.println("Final Amount : "+(double)a*40/100);
		}
		else if(a>=7000)
		{
			System.out.println("Final Amount : "+(double)a*60/100);
		}
		else if(a>=5000)
		{
			System.out.println("Final Amount : "+(double)a*80/100);
		}
		else
		{
			System.out.println("No Discount, Final Amount : "+(double)a);
		}
	}
}
