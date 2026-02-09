import java.util.*;
class FrequencyOfString{
	public static void main(String[] args){
	
	String str = "Hello i am Tejas i am from nagar";
	
	String [] ar = str.split(" ");
	boolean [] trace =new boolean[ar.length];
	
	System.out.println(Arrays.toString(ar));
	
		for(int i=0;i<ar.length;i++){
	
		int cnt=1;
		if(trace[i])continue;
		
			for(int j=i+1;j<ar.length;j++){
				
				if(ar[i].equals(ar[j])){
				
					cnt ++;
					trace[j]=true;
				}
			}
			System.out.println(ar[i]);
		}
	}
}