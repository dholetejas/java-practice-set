import java.util.Arrays;
class TernaryIterative
{
	public static void main(String[] args){
	
		int [] ar = new int[20];
		for(int i=1;i<=ar.length;i++)
			ar[i-1]=i;
		System.out.println(Arrays.toString(ar));
		
		int key =9;
	
		int pos = teranaryIter(ar,ar.length-1,key);
		System.out.println(key+ " : "+pos);

	} 
	public static int teranaryIter(int [] ar,int n,int key){
		
		int min = 0;
		int max = n;
		
		while(min<=max){
		
			int mid1 = min+(max-min)/3;
			int mid2 = max-(max-min)/3;
			
			
				if(ar[mid1]==key) return mid1;
				if(ar[mid2]==key) return mid2;
				
				if(key<ar[mid1]) max = mid1-1;
				else if(key >ar[mid2]) min = mid2+1;
				
				else{
					min = mid1+1;
					max = mid2-1;
				}
		}
		return -1;
	}	

}