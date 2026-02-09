import java.util.Arrays;
class FrequencyOfArray{
	public static void main(String[] args){
	
	int [] ar ={1,2,3,1,2,7,8,9};
	
	boolean [] trace = new boolean [ar.length];
	System.out.println(Arrays.toString(ar));

		for(int i=0;i<ar.length;i++){
		
		int cnt=1;
		if(trace[i])continue;
		
			for(int j=i+1;j<ar.length;j++){
				
				if(ar[i]==ar[j]){
				cnt++;
				
				trace [j]=true;
				}
			}
			if(cnt==1){
			
			System.out.println(ar[i]); 
			}  
		
		}
	}
}
	