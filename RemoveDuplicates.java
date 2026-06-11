import java.util.*;
class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		int a[] = {1,1,2,2,3,4,5,5,6,7,7,8,9};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<=i; j++){
				if(a[i]!=a[j] && i!=j){
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
