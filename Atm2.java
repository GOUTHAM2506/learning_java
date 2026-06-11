//With do while loop
import java.util.Scanner;
class Atm2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int bal = 1000;
		System.out.print("\t\tATM\n1 - Display\n2 - Deposit\n3 - Withdrawl\n4 - Exit");
		int amo;
		int opt;
		do
		{
			System.out.print("\nEnter your function : ");
			opt = sc.nextInt();
			switch (opt)
			{
				case 1:	System.out.println("Balance : "+bal);
						break;
				case 2: System.out.print("Enter your amount : ");
						amo = sc.nextInt();
						bal+=amo;
						System.out.println("\tAmount Deposited Successfully\nCurrent Balance : "+bal);
						break;
				case 3: System.out.print("Enter your amount : ");
						amo = sc.nextInt();
						if(amo<=bal)
						{
							bal-=amo;
							System.out.println("\tAmount Withdrawed Successfully\n Current Balance: "+bal);
						}
						else	System.out.println("Insufficient Balance\nCurrent Balance = "+bal);
						break;
				case 4: System.out.println("Thank you for using Our ATM");
						break;
				default: System.out.println("Enter a valid option.");
			}
		}while (opt!=4);
	}
}