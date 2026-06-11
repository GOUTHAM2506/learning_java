import java.util.Scanner;
import java.util.Arrays;
class Sorted
{
	static Scanner sc = new Scanner(System.in);
	
	public static boolean sort(int a[])
	{
		for(int i = 0; i < a.length-1; i++)
		{
			if(a[i] > a[i+1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter a array values : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		if(sort(a)) System.out.println("Sorted");
		else System.out.println("Not Sorted");
	}
}