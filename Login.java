import java.util.Scanner;
class Login
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\tWelcome to my Application\n");
		long regphNo = 9876543210L;
		System.out.print("Enter your Phone Number : ");
		long userphNo = sc.nextLong();
		System.out.println("\n\tProcessing.....");
		Thread.sleep(2000);
		if(regphNo == userphNo)
		{
			int genOtp = (int)(Math.random()*9000)+1000;
			System.out.println("\n\tGenerating Otp.....");
			Thread.sleep(1000);
			System.out.println("\nYour OTP is : "+genOtp+". Don't share to anyone");
			System.out.print("\nEnter Otp : ");
			int userOtp = sc.nextInt();
			System.out.println("\n\tProcessing.....");
			Thread.sleep(2000);
			if(genOtp == userOtp)
			{
				System.out.println("\n\tLogin Done Successfully");
			}
			else
			{
				System.out.println("\n\tInvalid Credentials");
			}
		}
		else
		{
			System.out.println("\n\tInvalid Credentials");
		}
	}
}
