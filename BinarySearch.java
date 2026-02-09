
class BinarySearch{
	public static void main(String[] args){
		
		int []ar = {5,10,15,30,65,91,111,210,512,1000};
	}
	
	public static void binarySearch(int [] ar,int search){
		
		BubbleSort.bubbelSort(ar);
	
		int start =0,end=ar.length-1,mid;
	
		mid =(start + end)/2;
	
		while(start <= end ){
		
			if(ar[mid]==search){
				System.out.println("Element found at "+mid+"index");
				break;
			}
			else if(ar[mid]>search){
				end  = mid-1;
			}
			else if(ar[mid]<search){
				start = mid +1;
			}
			mid = (start + end)/2;
		}
	}
}