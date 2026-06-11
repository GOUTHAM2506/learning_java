class String1 
{
	public static void main(String[] args) 
	{
		String s1 = 10+"Java"+10+20;
		String s2 = 10+20+"Java"+30;
		String s3 = "Java"+10+20+30;
		String s4 = "Java"+(10+20+30);
		String s5 = 10+20+30+"Java";
		String s6 = "Result: "+10+20+30;
		String s7 = "Result: "+(10+20+30);
		String s8 = 10+20+"Java"+(10+20);
		String s9 = "Sum of "+10+" and "+20+" is "+(10+20);
		String s10 = "Output: "+(10+20)+"Java"+(30+40);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
	}
}
