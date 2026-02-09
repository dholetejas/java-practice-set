import java.util.Scanner;
class StudentEx{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	for( ; ;){
	System.out.println("Enter your marks:");
	int marks=sc.nextInt();
	int totalMarks =500;
	if(marks<0 || marks>totalMarks){
		System.out.println("Invalid markss"+marks+"entered");
		return;
	
	}
	float per = (marks*100)/totalMarks;
	System.out.println("You obtained "+marks+ "marks and your percentage is"+per);
	
	String grade =" ";
	if(per>=90){
		grade="O";
		System.out.println("Outstanding");
	}
	else if(per>=75){
		grade="A+";
		System.out.println("First class with distinction");
	}
	else if(per>=60){
		grade="A";
		System.out.println("First class");
	}
	else if(per>=50){
		grade="B";
		System.out.println("Second class");
	}
	else if(per>=35){
		grade="c";
		System.out.println("Pass");
	}
	else{
		System.out.println("FAIL");
	}
	System.out.println("	Grade: "+grade);
	}
	}
}

	
	
		