class A {
	int x = 10;
	void m1() {
		int x = 50;
		System.out.println(x);
	}
}

class B extends A {
	int x = 20;
}

class VariableShadowing 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A ob1 = new A();
		System.out.println(ob1.x);//10
		ob1.m1();//50
		B ob2 = new B();
		System.out.println(ob2.x);//20
		A ob3 = new B();
		System.out.println(ob3.x);//10
	}
}
