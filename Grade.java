import java.util.Scanner;
class Grade 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your marks: ");
		int m = sc.nextInt();
		if(m>=90){
			System.out.println("A Grade");
		}
		else if(m>=75){
			System.out.println("B Grade");
		}
		else if(m>=60){
			System.out.println("C Grade");
		}
		else if(m>=35){
			System.out.println("D Grade");
		}
		else{
			System.out.println("You are Fail");
		}
	}
}
