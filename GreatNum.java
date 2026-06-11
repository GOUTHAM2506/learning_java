import java.util.Scanner;
class GreatNum
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();
		String ans = (a>b) ? a+" is greater than "+b : b+" is greater than "+a;
		System.out.println(ans);
	}
}
