import java.util.Scanner;
class EvenOdd
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		String ans = (n%2==0) ? "It is an even number" : "It is an odd number";
		System.out.print(ans);
	}
}