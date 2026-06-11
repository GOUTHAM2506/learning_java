import java.util.Scanner;
class MagicNumber
{
	static Scanner sc = new Scanner(System.in);
	
	public static boolean magic(int n)
	{
		while(n>9)
		{	
			n = sum(n);
		}
		return n==1;
	}
	
	public static int sum(int n)
	{
		int s = 0;
		while(n>0)
		{
			int ld = n % 10;
			s += ld;
			n /= 10;
		}
		return s;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(magic(n))	System.out.println(n+" is a magic number");
		else	System.out.println(n+" is not a magic number");
	}
}
