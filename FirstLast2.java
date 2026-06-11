import java.util.Scanner;
class FirstLast2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int lastDigit = n%10;
		n /= 10;
		while(n>9)
		{
			int ld = n % 10;
			n /= 10;
		}
		System.out.println("FirstDigit : "+n+"\nLastDigit  : "+lastDigit);
	}
}
