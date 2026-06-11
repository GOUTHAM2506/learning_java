class Parent {
	public static void sleep() {
		System.out.println("Parent is sleeping");
	}
}

class Child extends Parent {
	public static void sleep() {
		System.out.println("Child is sleeping");
	}
}

class MethodShadowing {
	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.sleep();
		Parent p1 = new Parent();
		p1.sleep();
		Parent p2 = new Child();
		p2.sleep();
	}
}
