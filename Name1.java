//Name
import java.util.Scanner;
class Name1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter your range : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//G
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || (j==n-1 && i>=n/2) || (j>=n/2 && i==n/2)) System.out.print("G ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//O
			for(int j=0;j<n;j++)
			{
				if((i==0 && j!=n-1 && j!=0) || (i==n-1 && j!=n-1 && j!=0) || (j==0 && i!=0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1)) System.out.print("* ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//U
			for(int j=0;j<n;j++)
			{
				if(i==n-1 || j==0 || j==n-1) System.out.print("U ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//T
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==n/2) System.out.print("T ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print(" ");
			//H
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==n/2) System.out.print("H ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//A
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n/2 || j==0 || j==n-1) System.out.print("A ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//M
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || (i==j && i<=n/2) || (i+j==n-1 && i<=n/2)) System.out.print("M ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			System.out.println();
		}
	}
}
