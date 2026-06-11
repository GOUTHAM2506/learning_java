import java.util.Scanner;
class Alphabet1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter your range : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//K
			for(int j=0;j<n;j++)
			{
				if(j==0 || i+j==n-1-n/2+1 || i==j+n/2-1) System.out.print("* ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			/*//Q
			for(int j=0;j<n;j++)
			{
				if((i==0 && i>n-1) || (j==0 && j>n-1) || i==n-2 || j==n-2 || (i==j && i>=n/2)) System.out.print("* ");
				else System.out.print("  ");
				Thread.sleep(5);
			}*/
			//D
			for(int j=0;j<n;j++)
			{
				if((i==0 && j!=n-1) || (i==n-1 && j!=n-1) || j==0 || (j==n-1 && i!=0 && i!=n-1)) System.out.print("* ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			//B
			for(int j=0;j<n;j++)
			{
				if((i==0 && j!=n-1) || (i==n/2 && j!=n-1) || (i==n-1 && j!=n-1) || j==0 || (j==n-1 && i!=0 && i!=n-1 && i!=n/2)) System.out.print("* ");
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
			//Q
			for(int j=0;j<n;j++)
			{
				if((i==0 && j!=n-1 && j!=0) || (i==n-1 && j!=n-1 && j!=0) || (j==0 && i!=0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1) || (i==j && i>=n/2)) System.out.print("* ");
				else System.out.print("  ");
				Thread.sleep(5);
			}
			System.out.print("   ");
			System.out.println();
		}
	}
}