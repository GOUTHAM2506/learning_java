class PivotNumber 
{
	public static void main(String[] args) 
	{
		int a[] = {8, 13, 40, 50, 1, 2, 3};
		int n = a.length;
		int s = 0;
		int e = n-1;
		while (s <= e)
		{
			int m = (s + e)/2;
			if (a[m] > a[0]) s = m + 1;
			else e = m;
		}
		System.out.println(s);
	}
}
