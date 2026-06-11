import java.util.Scanner;
class Salary2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Salary : ");
		int s = sc.nextInt();
		System.out.print("Enter HRA : ");
		int h = sc.nextInt();
		System.out.print("Enter DA : ");
		int d = sc.nextInt();
		System.out.print("Gross salary : "+(s+h+d));
	}
}
