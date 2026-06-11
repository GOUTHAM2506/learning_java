import java.util.Scanner;
class ElectricBill
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter units : ");
		int u = sc.nextInt();
		if(u<=100)
		{
			System.out.println("Electricity Bill : "+u*2);
		}
		if(u<=200)
		{
			System.out.println("Electricity Bill : "+u*3);
		}
		if(u<=300)
		{
			System.out.println("Electricity Bill : "+u*5);
		}
		else
		{
			System.out.println("Electricity Bill : "+u*8);
		}
	}
}
