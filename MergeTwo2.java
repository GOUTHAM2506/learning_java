import java.util.Arrays;
class MergeTwo2
{
	public static void main(String[] args) 
	{
		int a[] = {4,7,10,12};
		int b[] = {6,8,9,11,13,15,18};
		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length || j<b.length)
		{
			if(i == a.length)	c[k++] = b[j++];
			
			else if(j == b.length)	c[k++] = a[i++];
			
			else if(a[i] < b[j])	c[k++] = a[i++];
			
			else	c[k++] = b[j++];
		}
		System.out.println(Arrays.toString(c));
	}
}