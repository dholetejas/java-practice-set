import java.util.Scanner;
class Finance{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the monthly saving amount:");
	double savingAmount = sc.nextDouble();
	double monthlyInterestRet= 0.05/12;
	double accountAmount=0;
	for(int i=0;i<6;i++){
	accountAmount = (accountAmount + savingAmount)*(1 + monthlyInterestRet)  ;
	}
	System.out.println("accountAmount:"+accountAmount);
	}
	
}
