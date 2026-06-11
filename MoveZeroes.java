import java.util.Arrays;
class MoveZeroes 
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0,3,12};
		int n = a.length;
		int i = 0 ,j = 0;
		while(j<n)
		{
			if(a[j]==0)
			{
				j++;
			}
			else{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
