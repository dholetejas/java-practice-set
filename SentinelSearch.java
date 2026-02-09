import java.util.Arrays;
class SentinelSearch{
	public static void main(String[] args){
		
		
		int [] arr = new int [20];
		for(int i=0;i<arr.length;i++)
			arr[i] = (int)(Math.random()*100);

		System.out.println(Arrays.toString(arr));
	
		int key =21;
	   
		int ops = sentinelSearch(arr,arr.length,key);
		System.out.println(key+" : "+ops);
	}
	public static int sentinelSearch(int[]arr,int n,int key){
		int last = arr[n-1];
		arr[n-1]=key;
	
		int i=0;
		while(arr[i]!=key)i++;
		arr[n-1]=last;
	
		if(i<n && arr[i]==key)return i;
		else return -1;
	}
}
	