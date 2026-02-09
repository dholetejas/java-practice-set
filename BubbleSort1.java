import java.util.Arrays;
class BubbleSort1{
	public static void main(String[] args){
		
		int [] ar ={77,14,9,85,67,107,1};
		
		System.out.println(Arrays.toString(ar));
		
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	

	}
	public static void bubbleSort(int [] a){
	
		for(int i=0;i<a.length-1;i++){
			
			for(int j=0;j<a.length-1-i;j++){
			
				if(a[j] > a[j+1]){
				
					int temp = a[j];
				
					a[j] = a[j+1];
	
					a[j+1] = temp;
				}
			}
		}
	}
}