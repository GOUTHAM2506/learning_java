import java.util.Scanner;
class BinaryToDecimal
{
	static Scanner sc = new Scanner(System.in);
	
	public static Boolean isBinary(int b)
	{
		while(b>0)
		{
			int ld = b % 10;
			if(ld != 0 && ld !=1) return false;
			b /= 10;
		}
		return true;
	}
	
	public static int power(int b, int p)
	{
		int mul = 1;
		for(int i = 1; i <= p; i++)	mul *= b;
		return mul;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter your binary value : ");
		int b = sc.nextInt();
		if(isBinary(b))
		{
			int temp = b;
			int sum = 0;
			int p = 0;
			while(b>0)
			{
				int ld = b % 10;
				sum += ld * power(2, p);
				p++;
				b /= 10;
			}
			System.out.println("\nYour decimal value of "+ temp +" is : "+ sum);
		}
		else System.out.println("\nNot a binary number.");
	}
}
