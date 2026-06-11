import java.util.Arrays;
class ProductSelf
{
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4};
		int n = a.length;
		int pre[] = new int[n];
		int suf[] = new int[n];
		int ans[] = new int[n];
		pre[0] = 1;
		suf[n-1] = 1;
		for(int i=1;i<n;i++)
		{
			pre[i] = pre[i-1] * a[i-1];
		}
		for(int i=n-2;i>=0;i--)
		{
			suf[i] = suf[i+1] * a[i+1];
		}
		for(int i=0;i<n;i++)
		{
			ans[i] = pre[i] * suf[i];
		}
		System.out.println(Arrays.toString(pre));
		System.out.println(Arrays.toString(suf));
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(a));
	}
}
