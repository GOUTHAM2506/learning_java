import java.util.Scanner;
class MissingNumber
{
	static Scanner sc = new Scanner(System.in);
	
	public static int missing(int arr[], int n)
	{
		for(int i = 1;i <= n; i++)
		{
			int count = 0;
			for(int j = 0;j < arr.length; j++){
				if(i!=arr[j]) count++;
			}
			if(count==n-1) return i;
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter a array values : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Missing Number is "+missing(arr,n));
	}
}
