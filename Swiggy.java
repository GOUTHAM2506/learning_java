import java.util.Scanner;
class Swiggy
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\tWelcome to Swiggy!");
		System.out.println("1-SS Hyderabad Biryani\n2-A2B\n3-Pandias");
		System.out.print("Enter your option : ");
		int opt = sc.nextInt();
		int s,qua,bill;
		switch (opt)
		{
			case 1: System.out.println("\t Welcome to SS Hyderabad Biryani");
					System.out.println("\tMenu : \n1-Chicken Dum Biryani Rs.300\n2-Mutton Biryani Rs.450\n3-Chicken 65 (Boneless) Rs.310");
					System.out.print("Enter your option : ");
					s = sc.nextInt();
					System.out.print("Enter your quantity : ");
					qua = sc.nextInt();
					bill = 0;
					if (s==1)
					{
						bill = 300*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==2)
					{
						bill = 450*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==3)
					{
						bill = 310*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else
					{
						System.out.println("Enter a valid option");
					}
					break;
			case 2: System.out.println("\t Welcome to A2B");
					System.out.println("\tMenu : \n1-Ghee Roast Dosa Rs.150\n2-Mini Tiffin Combo Rs.170\n3-Sambar Idli / Idli-Vada Rs.70");
					System.out.print("Enter your option : ");
					s = sc.nextInt();
					System.out.print("Enter your quantity : ");
					qua = sc.nextInt();
					bill = 0;
					if (s==1)
					{
						bill = 150*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==2)
					{
						bill = 170*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==3)
					{
						bill = 70*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else
					{
						System.out.println("Enter a valid option");
					}
					break;
			case 3: System.out.println("\t Welcome to Pandias");
					System.out.println("\tMenu : \n1-Mutton Biryani / Special Mutton Kuruma Rs.400\n2-Mutton Chops / Attukal Paya Rs.370\n3-Chicken Biryani Rs.350");
					System.out.print("Enter your option : ");
					s = sc.nextInt();
					System.out.print("Enter your quantity : ");
					qua = sc.nextInt();
					bill = 0;
					if (s==1)
					{
						bill = 400*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==2)
					{
						bill = 370*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else if (s==3)
					{
						bill = 350*qua;
						System.out.println("\tGenerating bill.....");
						Thread.sleep(1000);
						System.out.println("Your bill is "+bill);
						System.out.print("Do you want to proceed for payment [Y/N] : ");
						char ans = sc.next().charAt(0);
						if (ans=='y' || ans == 'Y')
						{
							System.out.print("Enter your amount : ");
							int amount = sc.nextInt();
							if (amount == bill)
							{
								int genOtp = (int)(Math.random()*9000)+1000;
								System.out.println("\tGenerating Otp.....");
								Thread.sleep(1000);
								System.out.println("Your OTP is : "+genOtp+". Don't share to anyone");
								System.out.print("Enter Otp : ");
								int userOtp = sc.nextInt();
								System.out.println("\tProcessing.....");
								Thread.sleep(2000);
								if (userOtp == genOtp)
								{
									System.out.println("Order has been Placed");
								}
								else
								{
									System.out.println("Wrong Otp, Order has been cancelled");
								}
							}
							else
							{
								System.out.println("Enter the right amount");
							}
						}
						else if (ans=='n' || ans == 'N')
						{
							System.out.println("Payment has been cancelled, Order has been cancelled");
						}
					}
					else
					{
						System.out.println("Enter a valid option");
					}
					break;
			default: System.out.println("Enter a valid option");
		}
	}
}
