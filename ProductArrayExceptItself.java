import java.util.Arrays;

class ProductArrayExceptItself 
{
	public static int[] product(int arr[]){
		int n = arr.length;
		int count = 0;
		int res[] = new int[n];
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) count++;
		}
		if(count == 0){
			int product = 1;
			for(int i=0; i<n; i++){
				product *= arr[i];
			}
			for(int i=0; i<n; i++){
				res[i] = product / arr[i];
			}
		}
		else if(count == 1){
			int product = 1;
			for(int i=0; i<n; i++) {
				if(arr[i]!=0) product *= arr[i];
			}
			for(int i=0; i<n; i++){
				if(arr[i]!=0) res[i]=0;
				else res[i]=product;
			}
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1, 4, 5, 0, 0};
		System.out.println(Arrays.toString(product(arr)));
	}
}
