import java.util.Arrays;
class BinaryPractice{
	public static void main(String [] args){
		
		int[] ar = new int[20];
		for(int i=0;i<ar.length;i++)
		ar[i] = (int)(Math.random()*100);
		

		int key = 21;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		int pos1 =binaryRec(ar,0,ar.length-1,key);
		//int pos2 =binaryIterative(ar,ar.length,key);
		System.out.println(key+" : "+pos1);
		//System.out.println(key+" : "+pos2);
	}
	public static int binaryRec(int [] ar,int min,int max,int key){
	
		if(min>max)return -1;
		int mid =(max+min)/2;
		
		if(ar[mid]==key)
		return mid;
		
		else if(key<ar[mid])
			return binaryRec(ar,min,mid-1,key);
		else
			return binaryRec(ar,mid+1,max,key);
	}
	public static int binaryIterative(int ar[],int n,int key){
		int min= 0; int max = n-1;
		
		while(
	
}
		