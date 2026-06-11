import java.util.Scanner;
class MissingNumber2 
{
	static Scanner sc = new Scanner(System.in);
		
	public static int missing(int arr[], int n)
	{
		int sum = (n*(n+1))/2;
		int asum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			asum += arr[i];
		}
		return sum-asum;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array values : ");
		for(int i = 0; i < arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		int v = missing(arr,n);
		if(v==0) System.out.print("There is no missing number.");
		else	System.out.print("Missing Number is "+v);
	}
}
