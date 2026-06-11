class Swap 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("Swapping using temp variable");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
		a=10;
		b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapping without using temp variable");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
}
