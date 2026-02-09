class Mobile{
	String brand;
	String model;
	double price;
	int storage;
	String color;
	String processor;
	int ram;
	double screenSize;
	double weight;

	public void displayMobileInfo(){
	
		System.out.println("\nMobile Info");
		System.out.printf("Brand :%s%n",brand);
		System.out.printf("Model :%s%n",model);
		System.out.printf("price :%f rs %n",price);
		System.out.printf("Storage :%d gb %ncolor :%s%n",price);
		System.out.printf("Processor : %s%n Ram : %d%n",processor,ram);
		System.out.printf("screenSize :%f inch %n weight : %f gms",screenSize,weight);
	
	}
}
class MobileDriver{
	public static void main(String[] args)
	{
	Mobile mo = new Mobile("SAMSUNG", "S25 ULTRA", 130000, 1024, "BLACK", "SNAP DRAGON", 12, 7.8, 210);
		
		mo.displayMobileInfo();
		
	}
}	