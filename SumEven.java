import java.util.Scanner;
class SumEven
{
	static Scanner sc = new Scanner(System.in);
	
	public static int even(int ld)
	{
		if(ld%2==0) return ld;
		else return 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0)
		{
			int ld = n%10;
			sum+=even(ld);
			n/=10;
		}
		System.out.println("Sum : "+sum);
	}
}
