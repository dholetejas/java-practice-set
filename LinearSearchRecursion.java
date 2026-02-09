import java.util.Arrays;
class LinearSearchRecursion{
	public static void main(String[] args){
		int ar[] = new int[20];
		for(int i=0;i<ar.length;i++)
			ar[i] =(int)(Math.random()*100);
		
			System.out.println(Arrays.toString(ar));
		
		int key=24;
		
		int pos = linearRec(ar,ar.length,key,0);
		System.out.println(key+" : "+pos);
	}
	public static int linearRec(int[] ar,int n,int key,int i){
		
		if(i==n)return -1;
	
		if(ar[i]==key)return i;
		return linearRec(ar,n,key,++i);
	}
}