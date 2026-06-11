import java.util.Arrays;

class ProductArrayExceptItself2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int n = a.length;
		int res[] = new int[n];
		//Prefix
		int p = 1;
		for(int i=0; i<n; i++){
			res[i] = p;
			p *= a[i];
		}
		//Suffix
		int s = 1;
		for(int i=n-1; i>=0; i--){
			res[i] *= s;
			s *= a[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
