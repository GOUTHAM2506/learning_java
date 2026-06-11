import java.util.Scanner;
class FirstLast 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while(temp>0)
		{
			temp /= 10;
			count++;
		}
		int tempcount = count;
		int lastDigit = 0;
		int firstDigit = 0;
		while(n>0)
		{
			int ld = n % 10;
			if(count==tempcount)	lastDigit=ld;
			if(count==1)	firstDigit=ld;
			count--;
			n /= 10;
		}
		System.out.println("FirstDigit : "+firstDigit+"\nLastDigit  : "+lastDigit);
	}
}
