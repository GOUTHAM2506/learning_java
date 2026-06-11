class Animal {
	String color;
	String name;
	void eat() {
		System.out.println("Can eat");
	}
	void sleep() {
		System.out.println("Can sleep");
	}
}

class Cat extends Animal {
	void jump() {
		System.out.println("Can jump high");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Can bark");
	}
}

class Hierarchical {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.eat();
		c1.sleep();
		c1.jump();
		System.out.println("--------------------");
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
		d1.bark();
	}
}
