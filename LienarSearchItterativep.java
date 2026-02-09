import java.util.Arrays;
class LienarSearchItterativep{
	public static void main(String[] args){

		int [] ar ={10,20,30,50,60,89,100};
		System.out.println(Arrays.toString(ar));
 
//Random Array logic 
		
		//int [] ar = new int[20];
		//for(int i=0;i<ar.length;i++)
			//ar[i]= (int)(Math.random()*100);
	
		int key =20;  
	
		int pos = linearSearch(ar,ar.length,key);
		System.out.println(key+" : "+pos);
	}
	
	public static int linearSearch(int[] ar, int n, int key){
	
		for(int i=0;i<n;i++){
			
			if(ar[i]==key)return i;
		}
		return -1;
	}
}
	