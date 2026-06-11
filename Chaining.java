class ABC {
	ABC() {
		this(5);
		System.out.println("Bye");
	}
	
	ABC(int a) {
		this("GM",5);
		System.out.println("Hello");
	}
	
	ABC(String s, int b) {
		System.out.println("Hi");
	}
}

class Chaining {
	public static void main(String[] args) 
	{
		ABC ob1 = new ABC();
	}
}
