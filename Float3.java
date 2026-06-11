import java.util.Scanner;
class Float3
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a float value: ");
		float a = sc.nextFloat();
		byte b = (byte)a;
		System.out.println("Float value of less than 127 prints the value : "+b);
	}
}
