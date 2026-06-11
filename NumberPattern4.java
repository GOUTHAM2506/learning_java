import java.util.Scanner;
class NumberPattern4
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your range : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(true) System.out.print(j+1+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
