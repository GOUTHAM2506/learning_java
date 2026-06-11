class Multiply2
{
	public static void main(String[] args) 
	{
		int mul = 1;
		for(int i=5;i<=15;i++)
		{
			if (i%2!=0)
			{
				mul*=i;
				System.out.print(mul+" ");
			}
		}
		System.out.println("\nProduct from 5 to 15 of Odd numbers is : "+mul);
	}
}
