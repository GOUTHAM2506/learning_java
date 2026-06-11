import java.util.Scanner;
class PosNeg
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		String ans = (n>=0) ? "It is positive" : "It is negative";
		System.out.print(ans);
	}
}
