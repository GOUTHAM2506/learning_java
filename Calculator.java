import java.util.Scanner;
class Calculator
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\tCalculator\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Select any option (+,-,*,/): ");
		char opt = sc.next().charAt(0);
		int n1;
		int n2;
		switch(opt)
		{
			case '+': System.out.print("Enter num1 : ");
					n1 = sc.nextInt();
					System.out.print("Enter num2 : ");
					n2 = sc.nextInt();
					System.out.println("Addition : "+(n1+n2));
					break;
			case '-': System.out.print("Enter num1 : ");
					n1 = sc.nextInt();
					System.out.print("Enter num2 : ");
					n2 = sc.nextInt();
					System.out.println("Subtaction : "+(n1-n2));
					break;
			case '*': System.out.print("Enter num1 : ");
					n1 = sc.nextInt();
					System.out.print("Enter num2 : ");
					n2 = sc.nextInt();
					System.out.println("Multiplication : "+(n1*n2));
					break;
			case '/': System.out.print("Enter num1 : ");
					n1 = sc.nextInt();
					System.out.print("Enter num2 : ");
					n2 = sc.nextInt();
					System.out.println("Divison : "+(n1/n2));
					break;
			default : System.out.println("Enter a valid option");
		}
	}
}
