class GF
{
	void GF() {
		System.out.println("I am the GrandFather.");
	}
}

class Fa extends GF{
	void Fa() {
		System.out.println("I am the Father.");
	}
}

class You extends Fa {
	void You() {
		System.out.println("I am You");
	}
}

class CastingMulInhe 
{
	public static void main(String[] args) 
	{
		GF g1 = new You();
		You y1 = (You) g1;
		y1.GF();
		y1.Fa();
		y1.You();
	}
}
