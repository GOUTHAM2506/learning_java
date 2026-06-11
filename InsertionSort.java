import java.util.Scanner;
import java.util.Arrays;
class InsertionSort 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array values: ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=1; i<n; i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		System.out.println(Arrays.toString(a));
	}
}
