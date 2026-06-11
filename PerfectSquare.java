import java.util.Scanner;
class PerfectSquare 
{
	static Scanner sc = new Scanner(System.in);
	
	public static boolean square(int n)
	{
		for(int i = 2; i <= n; i++)
		{
			if(i * i == n) return true;
			if(i * i > n) return false;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(square(n) ? n+" is a Perfect Square." : n+" is not a Perfect Square.");
	}
}
