import java.util.Scanner;
class EqGrLe 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number 1: ");
		int n = sc.nextInt();
		System.out.print("Enter number 2: ");
		int m = sc.nextInt();
		String ans = n==m ? "Equal" : n>m ? n+" is Greater than "+m : m+" is Greater than "+n;
		System.out.print(ans);
	}
}
