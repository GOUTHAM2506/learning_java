
interface A {
	void m1();
	static void m2() {
		System.out.println("I am m2, static method of Interface");
	}
	void m3();
}

class B implements A {
	@Override
		public void m1() {
			System.out.println("I am m1");
		}
		
		public void m3() {
			System.out.println("I am m3");
		}
}

class Interface1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		B ob1 = new B();
		ob1.m1();
		A.m2();
		ob1.m3();
	}
}
