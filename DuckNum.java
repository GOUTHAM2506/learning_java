//Duck Number
import java.util.Scanner;
class  DuckNum
{
	static Scanner sc  = new Scanner(System.in);
	public static String duck(int n)
	{
		while(n>0)
		{
			int ld = n%10;
			if(ld == 0)
			{
				return "Duck Number";
			}
			n/=10;
		}
		return "Not a Duck Number";
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		String o = duck(n);
		System.out.print(n+" is a "+o);
	}
}
