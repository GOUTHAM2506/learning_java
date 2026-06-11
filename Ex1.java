import java.util.Scanner;
class Ex1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Tables of "+n);
		int i = 1;
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}
	}
}
