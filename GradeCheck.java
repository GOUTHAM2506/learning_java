import java.util.Scanner;
class GradeCheck
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\tGrade Check\nEnter your Grade : ");
		char a = sc.next().charAt(0);
		switch (a)
		{
			case 'a','A':	System.out.println("Excellent");
							break;
			case 'b','B':	System.out.println("Very Good");
							break;
			case 'c','C':	System.out.println("Good");
							break;
			case 'd','D':	System.out.println("Pass");
							break;
			case 'f','F':	System.out.println("Fail");
							break;
			default: System.out.println("Enter a valid Grade.");
		}
	}
}
