//Heart
import java.util.Scanner;
class Pattern12
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
				//System.out.print(i+""+j+" ");
				if(i==n/2 || j==n/2 || (i+j>=(n/2)-2 && (i-j)*-1<=(n/2)+2 && i<=n/2 && (i>(n/2)-2 || i<(n/2)+2)) || (i-j<=n/2 && i+j<=(n+(n/2))-1 && i>=n/2))	System.out.print("* ");
				else	System.out.print("  ");
				//Thread.sleep(15);
			}
			System.out.println();
		}
	}
}