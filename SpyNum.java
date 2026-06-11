import java.util.Scanner;
class SpyNum
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int a = n;
		int count1 = 0;
		int count2 = 1;
		while (n>0)
		{
			int temp = n % 10;
			count1+=temp;
			count2*=temp;
			n/=10;
		}
		if(count1 == count2)	System.out.println(a+" is a SpyNumber");
		else	System.out.println(a+" is not a SpyNumber");
	}
}