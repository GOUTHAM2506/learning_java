class OverFlow 
{
	public static void main(String[] args) 
	{
		short a = 128;
		byte b = (byte)a;
		System.out.println("a :"+a+"\nb :"+b+"\nIt prints random value because it excess max value of byte which shows data overflow");
	}
}
