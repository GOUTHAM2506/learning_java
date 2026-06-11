import java.util.Scanner;
class SingleNumber2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array values : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < arr.length; i++)
		{
			ans ^= arr[i];
		}
		System.out.println(ans);
	}
}
