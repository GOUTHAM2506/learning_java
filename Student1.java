import java.util.Scanner;
class Student1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Student mark: ");
		double a = sc.nextDouble();
		int b = (int)a;
		System.out.print("Mark converted from double to int :"+b);
	}
}
