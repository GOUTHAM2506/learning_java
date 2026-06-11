import java.util.Scanner;
class Sum
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("Sum from 1 to "+a+" is : "+sum);
	}
}
