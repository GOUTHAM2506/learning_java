import java.util.Scanner;
import java.util.Arrays;
class LeftShift
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array values : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter a number of shifts : ");
		int s = sc.nextInt();
		s = s % arr.length;
		for(int i = 1; i <= s; i++)
		{
			int temp = arr[0];
			for(int j = 0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
