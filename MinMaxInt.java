import java.util.Scanner;
class MinMaxInt 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(n>0)
		{
			int ld = n % 10;
			max = Math.max(max,ld);
			min = Math.min(min,ld);
			n /= 10;
		}
		System.out.println("Largest Num : "+max+"\nSmallest Num : "+min);
	}
}
