//Hollow Triangle
import java.util.Scanner;
class Pattern8
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
				if(i==j || i==n-1 || j==0)	System.out.print("* ");
				else	System.out.print("  ");
				Thread.sleep(10);
			}
			System.out.println();
		}
	}
}
