import java.util.Scanner;
class ExamResult
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your marks : ");
		int m = sc.nextInt();
		if(m<35)
		{
			System.out.println("Fail");
		}
		else if(m<60)
		{
			System.out.println("Pass");
		}
		else if(m<75)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Distinction");
		}
	}
}
