import java.util.Arrays;
class TernarySearch{
	public static void main(String[] args){
	
		int [] ar = new int[20];
		
		for(int i=1;i<=ar.length;i++) ar[i-1]=i;
		
		System.out.println(Arrays.toString(ar));
	}
	
}