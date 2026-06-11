import java.util.Scanner;
class RangePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		for(int i=s;i<=e;i++)
		{
			if(isPrime(i))System.out.println(i);
		}
	}
	public static Boolean isPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)c++;
		}
		if(c==2)return true;
		return false;
	}
}
