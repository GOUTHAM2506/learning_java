//Side Triangle
import java.util.Scanner;
class Pattern11
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter a range : ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i+j<=n-1)	System.out.print("* ");
				else	System.out.print("  ");
				Thread.sleep(25);
			}
			System.out.println();
		}
	}
}
