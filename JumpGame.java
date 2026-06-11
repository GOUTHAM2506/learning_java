class JumpGame 
{
	public static void main(String[] args) 
	{
		int a[] = {3,2,1,0,4};
		int n = a.length;
		int d = n-1;
		for(int i=n-2; i>=0; i--)
		{
			if(a[i]+i >= d)	d = i;
		}
		System.out.println(d==0);
	}
}
