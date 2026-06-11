import java.util.Scanner;
class Vowels 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a character : ");
		char c = sc.next().charAt(0);
		switch (c)
		{
			case 'a','e','i','o','u':	System.out.println("Vowels in LowerCase");
										break;
			case 'A','E','I','O','U':	System.out.println("Vowels in UpperCase");
										break;
			default:	System.out.println("Consonants");
		}
	}
}
