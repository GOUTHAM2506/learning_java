import java.util.Scanner;
class SingleNumber 
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
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i]==arr[j]) count++;
			}
			if(count == 0)
			{
				System.out.print("Single number is "+arr[i]);
				break;
			}
		}
	}
}
