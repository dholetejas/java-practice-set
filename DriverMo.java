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
	
	public void displayMobileInfo()
	{
		System.out.println("\n Mobile Info");
		System.out.printf("Brand:%s%n",brand);
		System.out.printf("model:%s%n",model);
		System.out.printf("price:%f%n",price);
		System.out.printf("storage:%d%n",storage);
		System.out.printf("color:%s%n",color);
		System.out.printf("processor:%s%n",processor);
		System.out.printf("ram:%d%n",ram);
		System.out.printf("creenSize:%f%n",screenSize);
		System.out.printf("weight:%f%n",weight);
	
	}
}
class DriverMo{
	public static void main(String[] args)
	{
		Mobile mo = new Mobile();
		mo.brand="Samsung";
		mo.model="S25 ultra";
		mo.price=100000;
		mo.storage=1024;
		mo.color="black";
		mo.processor="Snap dragon";
		mo.ram=12;
		mo.screenSize=7.8;
		mo.weight=210;
		mo.displayMobileInfo();
	}
}
		
