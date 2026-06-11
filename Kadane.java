class Kadane 
{
	public static void main(String[] args) 
	{
		int a[] = {-2, 1, -3, 4, -1, 2, 1,-5, 4};
		int sum = 0, s = 0, l = 0, maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
			if(sum > maxSum){
				maxSum = sum;
				l = i+1;
			}
			if(sum < 0)
			{
				sum = 0;
				s = i+1;
			}
		}
		System.out.print("The sequence of ");
		for(int i = s; i < l; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print(" has the maximum sum of "+ maxSum);
	}
}
