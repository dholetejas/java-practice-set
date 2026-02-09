import java.util.Arrays;
class ExponentialSearch{
	public static void main(String[] args){
	
	int [] arr = new int[20];
	
	for(int i=1;i<=20;i++) arr[i-1]=i;
	
	System.out.println(Arrays.toString(arr));
	
	int key = 8;
	
	int pos = exponentialSearch(arr,arr.length-1,key);
	
	System.out.println(key+" : "+pos);
	}

	public static int exponentialSearch(int [] arr,int n, int key)
	{
		if(arr[0]==key)return 0;

		int i=1;
		
		while(i<n && key >arr[i]){
		
			i*=2;
			
		
		}
		return binarySearch(arr,key,i/2,Math.min(n,i));
	}
	public static int binarySearch(int [] arr,int key,int min, int max)
	{
		while(min<=max)
		{
			int mid = (min+max)/2;
			
		if(arr[mid]==key)return mid;
		else if (key<arr[mid])max=mid-1; 
		else min =mid+1;
		}
		return -1;
		
	}
	
}
		
		