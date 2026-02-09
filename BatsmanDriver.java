class Batsman{
	String batsmanName;
	String Cuntry;
	String Type;
	int age;
	int run;
	int Hundreds;
	int fifties;
	int four;
	int six;
	
	public void batsmanInfo()
	{
		System.out.println("\n Batsman Info");
		System.out.printf("Batsman Name :%s%n ",batsmanName);
		System.out.printf("Batsman Cuntry :%s%n ",Cuntry);
		System.out.printf("Batsman Type :%s%n ",Type);
		System.out.printf("Batsman age :%d%n ",age);
		System.out.printf("Batsman run :%d%n ",run);
		System.out.printf("Batsman Hundreds :%d%n ",Hundreds);
		System.out.printf("Batsman fifties :%d%n ",fifties);
		System.out.printf("Batsman four :%d%n ",four);
		System.out.printf("Batsman six :%d%n ",six);
	}
}
class BatsmanDriver{
	public static void main(String[] args)
	{
		
		Batsman bat = new Batsman();
		
		bat.batsmanName="Virat";
		bat.Cuntry="India";
		bat.Type="RHS";
		bat.age=30;
		bat.run=15000;
		bat. Hundreds=100;
		bat.fifties=80;
		bat.four=1000;
		bat.six	=900;
		bat.batsmanInfo();
	}
}