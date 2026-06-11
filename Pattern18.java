//LL
import java.util.Scanner;
class Pattern18
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a range : ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if((j==0 && i<=n/2) || (j==n-1 && i>=n/2) || (i==0 && j<=n/2) || (i==n-1 && j>=n/2))	System.out.print("* ");
				else	System.out.print("  ");
			}
			System.out.println();
		}
	}
}