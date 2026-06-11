import java.util.Scanner;
class ApBa
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("1 Apple price $50\nHow many Apples do you need : ");
		int a = sc.nextInt();
		System.out.print("1 Banana price $6\nHow many Banana do you need : ");
		int b = sc.nextInt();
		System.out.println("Total : "+((a*50)+(b*6)));
	}
}
