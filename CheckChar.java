import java.util.Scanner;
class ChecKChar 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char a = sc.next().charAt(0);
		System.out.print(a);
		if(a>='a' && a<='z')
		{
			System.out.print("Lower case");
		}
		else if(a>='A' && a<='Z')
		{
			System.out.print("Upper case");
		}
		else if(a>='0' && a<='9')
		{
			System.out.print("Number");
		}
		else
		{
			System.out.print("Special Charcters");
		}
	}
}
