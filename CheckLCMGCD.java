import java.util.Scanner;
class CheckLCMGCD 
{
	static Scanner sc = new Scanner(System.in);
	
	static char c;
	
	public static void num()
	{
		System.out.print("Enter a num : ");
		int a = sc.nextInt();
		System.out.print("Enter a GCD : ");
		int g = sc.nextInt();
		System.out.print("Enter a LCM : ");
		int l = sc.nextInt();
		System.out.println("Num 1 : "+a+"\nNum 2 :"+((g*l)/a)+"\nGCD : "+g+"\nLCM :"+l);
	}
	
	public static void gcdfind()
	{
		System.out.print("Enter a num 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a num 2 : ");
		int n2 = sc.nextInt();
		System.out.print("Do you know the LCM [Y/N]: ");
		c = sc.next().charAt(0);
		if(c == 'Y' || c == 'y')
		{
			System.out.print("Enter LCM : ");
			int l = sc.nextInt();
			System.out.println("Num 1 : "+n1+"\nNum 2 :"+n2+"\nGCD : "+((n1*n2)/l)+"\nLCM :"+l);
		}
		else	System.out.println("Num 1 : "+n1+"\nNum 2 :"+n2+"\nGCD : "+((n1*n2)/lcm(n1,n2))+"\nLCM :"+lcm(n1,n2));
	}
		
	public static void lcmfind()
	{
		System.out.print("Enter a num 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a num 2 : ");
		int n2 = sc.nextInt();
		System.out.print("Do you know the GCD [Y/N]: ");
		c = sc.next().charAt(0);
		if(c == 'Y' || c == 'y')
		{
			System.out.print("Enter GCD : ");
			int g = sc.nextInt();
			System.out.println("Num 1 : "+n1+"\nNum 2 :"+n2+"\nGCD : "+g+"\nLCM :"+((n1*n2)/g));
		}
		else	System.out.println("Num 1 : "+n1+"\nNum 2 :"+n2+"\nGCD : "+gcd(n1,n2)+"\nLCM :"+((n1*n2)/gcd(n1,n2)));
	}
	
	public static boolean check()
	{
		System.out.print("Enter a num 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a num 2 : ");
		int n2 = sc.nextInt();
		System.out.print("Do you know the LCM [Y/N]: ");
		c = sc.next().charAt(0);
		if(c == 'Y' || c == 'y')
		{
			System.out.print("Enter LCM : ");
			int l = sc.nextInt();
			System.out.print("Do you know the GCD [Y/N]: ");
			c = sc.next().charAt(0);
			if(c == 'Y' || c == 'y')
			{
				System.out.print("Enter GCD : ");
				int g = sc.nextInt();
				if(n1*n2 == l*g) return true;
				return false;
			}
			else
			{
				if(n1*n2 == l*gcd(n1,n2))	return true;
				return false;
			}
		}
		else
		{
			System.out.print("Do you know the GCD [Y/N]: ");
			c = sc.next().charAt(0);
			if(c == 'Y' || c == 'y')
			{
				System.out.print("Enter GCD : ");
				int g = sc.nextInt();
				if(n1*n2 == lcm(n1,n2)*g) return true;
				return false;
			}
			else
			{
				if(n1*n2 == lcm(n1,n2)*gcd(n1,n2)) return true;
				return false;
			}
		}
		
	}
	
	public static int gcd(int n1 , int n2)
	{
		int gcd = 1;
		for(int i = 1; i <= small(n1,n2); i++)
		{
			if(n1 % i == 0 && n2 % i == 0)	gcd = i;
		}
		return gcd;
	}
	
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
	
	public static int small(int n1, int n2)
	{
		if(n1 < n2) return n1;
		return n2;
	}
	
	public static int great(int n1, int n2)
	{
		if(n1 > n2) return n1;
		return n2;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\t\tLCM and GCD\n1 - Find one of the number\n2 - Find GCD by LCM\n3 - Find LCM  by GCD\n4 - Find both are equal\n0 - End the function");
		int n;
		do
		{
			System.out.print("Enter your function : ");
			n = sc.nextInt();
			switch(n)
			{
				case 1: num();
						break;
				case 2: gcdfind();
						break;
				case 3:	lcmfind();
						break;
				case 4:	if(check())	System.out.println("Both are equal");
						else System.out.println("Both are not equal");
						break;
				case 0:	System.out.println("End of the function");
						break;
				default:	System.out.println("Enter a valid option");
			}
		}while(n!=0);
	}
}
