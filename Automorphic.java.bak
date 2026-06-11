import java.util.Scanner;
class Automorphic
{
	static Scanner sc = new Scanner(System.in);
	
	public static String formula(int n)
	{
		int sq = n*n;
		while(n>0)
		{
			if(n%10 == sq%10)
			{
				n/=10;
				sq/=10;
			}
			else return "not a Automorphic Number";
		}
		return "a Automorphic Number";
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a num : ");
		int n = sc.nextInt();
		System.out.println(n+" is "+formula(n));
	}
}
