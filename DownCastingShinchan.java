class Harry {
	void Harry() {
		System.out.println("Harry has smelly shock.");
	}
}

class Mitszi extends Harry {
	void Mitszi() {
		System.out.println("Mitszi cut Harry's Pocket Money from his salary.");
	}
}

class Himawari extends Harry {
	void Himawari() {
		System.out.println("Himawari likes Jewels just like Mitsze.");
	}
}

class Shinchan extends Harry {
	void Shinchan() {
		System.out.println("Shinchan likes BuriBuri Simon.");
	}
}

class DownCastingShinchan 
{
	public static void main(String[] args) 
	{
		Harry h1 = new Shinchan();
		Shinchan s1 = (Shinchan)h1;
		s1.Shinchan();
		s1.Harry();
	}
}
