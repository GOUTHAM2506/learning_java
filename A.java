class A 
{
	static int x = 50;
	static{
		System.out.println("Hi");
		x = 60;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(B.y);
	}
	static{
		System.out.println(x);
		System.out.println("Hello");
	}
}
class B
{
	static int y = 500;
	static {
		System.out.println("Good Morning");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(y);
	}
	static {
		System.out.println(y);
		y = 1000;
	}
}