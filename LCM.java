import java.util.Scanner;
class LCM
{
	static Scanner sc = new Scanner(System.in);
	
	public static int lcm(int n1 , int n2)
	{
		int i = 1;
		int g = great(n1, n2);
		int s = small(n1, n2);
		while(true)
		{
			if((g*i)%s==0)
				return g*i;
			i++;
		}
	}
	
	public static int great(int n1, int n2)
	{
		if(n1 > n2) return n1;
		return n2;
	}
	
	public static int small(int n1, int n2)
	{
		if(n1 < n2) return n1;
		return n2;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter num 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter num 2 : ");
		int n2 = sc.nextInt();
		System.out.print("LCM of "+n1+" and "+n2+" is : "+lcm(n1,n2));
	}
}
