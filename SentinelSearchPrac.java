import java.util.Arrays;
class SentinelSearchPrac{
	public static void main(String[] args){
		int [] ar ={1,6,3,5,8,9,2,4,7};
		System.out.println(Arrays.toString(ar));
		
		int key=9;
		int pos = sentinelSearch(ar,ar.length,key);
		System.out.println(key+" : " +pos);
	}
	public static int sentinelSearch(int [] ar, int n,int key)
	{  
		int last = ar[n-1];
		ar[n-1] = key;
	
		int i= 0;
		
		while(ar[i]!=key)

			
			i++;
		ar[n-1]=last;
		
		if(i<n-1 || last ==key)return i;
		
		else return -1;
	}
}
 