import java.util.Arrays;
class LinearSearchRecur{
	public static void main(String[] args){
		
		int [] arr = new int [20];
		for(int i=0;i<arr.length;i++)
			arr[i] = i+1;

		System.out.println(Arrays.toString(arr));
	
		int key =5;
	
		int ops = linearSearch(arr,arr.length,key,0);
		System.out.println(key+" : "+ops);
	}
	public static int linearSearch(int [] arr,int n,int key ,int i){
		
		if(i==n) return -1;
		if(arr[i]==key)return i;
		return linearSearch(arr,n,key,++i);
	}
}
		