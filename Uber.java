import java.util.Scanner;
import java.util.ArrayList;
class Driver{
	private String name;
	private Long contact;
	
	Driver(String name,Long contact){
		this.name=name;
		this.contact=contact;
	}
	
	public void getDriver(){
		System.out.println("\n Driver Info ");
		System.out.println("Driver :"+name);
		System.out.println("Driver :"+contact+"\n");
	}
}
	
class Cab{
	static int id=345678;
	private Driver driver;
	private String number;
	private String uberId;
	private String type;
	private int capacity;
	private String status = "Availabel";
	private String location = "Deccan";
	
	String [] typeVehicle = {"hatchback","sedan","suv","muv"};
	int [] vehicleCapacity = {3,4,5,6};
	{
		this.uberId = "UBER" + id++;
	}
	Cab(String number,String type,Driver driver)
	{
		this.number=number;
		this.type=type.toLowerCase();
		
		int indx = 0;
		for(String element : typeVehicle){
			if(type.toLowerCase().equals(element)){
				break;
			}
			indx++;
		}
		this.capacity = vehicleCapacity[indx];
		this.driver = driver;
		
		
	}
	
	public void getCabDetials()
	{
		System.out.println("\n CAB DETAILS");
		System.out.println("Uber Id :" +uberId);
		System.out.println("Status :" +status);
		System.out.println("Cab Number :" +number);
		System.out.println("Type :" +type);
		System.out.println("Capacity : " +capacity);
		System.out.println("Location :" +location);
		System.out.println(" ");
	}
	public String getCabNumber(){
		return number;
	}
	public Driver getDriver(){
		return driver;
	}
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String newStatus){
	status = newStatus;
	}
	public int getCapacity(){
		return capacity;
	}
	public String getUberId(){
		return uberId;
	}
}

class UberDriver{
	public static void main(String[] args)
	{
		Uber uber = new Uber();
		uber.homeModule();
	}
}
class Passenger{
	private String name;
	private Long contact;
	private String email;
	private String pickupLocation;
	private String dropLocation;
	private int seats;

	Passenger(String name, Long contact,
		String email,String pickupLocation,String dropLocation,
		int seats)
	{
		super();
		this.name=name;
		this.contact = contact;
		this.email = email;
		this.pickupLocation=pickupLocation;
		this.dropLocation=dropLocation;
		this.seats=seats;
	}
	public String getName(){
		return name;
	}
	public void SetName(String newName){
		this.name=newName;
	}
	public Long getContact(){
		return contact;
	}
	public void setContact(Long newContact){
		this.contact=newContact;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String newEmail){
		this.email=newEmail;
	}
	public String getPickupLocation(){
		return pickupLocation;
	}
	public void setPickupLocation(String newPickupLocation){
		this.pickupLocation=newPickupLocation;
	}
	public String getDropLocation(){
		return dropLocation;
	}
	public void setDropLocation(String newDropLocation){
		this.dropLocation=newDropLocation;
	}
	public int getSeats(){
		return seats;
	}
	public void  setSeats(int newSeats){
		this.seats=newSeats;
	}
}
class Uber{
	ArrayList<Cab> listCabs = new ArrayList();
	Passenger passenger;
	Cab currentCab;
	
	{
		Cab cab1 = new Cab ("MH-01-1231","sedan",new Driver("Ramesh Kumar",123456783L));
		Cab cab2 = new Cab ("MH-16-1232","suv",new Driver("Mukesh Kumar",1234567933L));
		Cab cab3 = new Cab ("MH-12-1233","hatchback",new Driver("Dinesh Kumar",1234567633L));
		Cab cab4 = new Cab ("MH-14-1234","muv",new Driver("Ganesh Kumar",1234567544L));
		Cab cab5 = new Cab ("MH-23-1235","sedan",new Driver("Hitesh Kumar",1234567455L));
		Cab cab6 = new Cab ("MH-11-1236","hatchback",new Driver("Suresh Kumar",1234567355L));

		listCabs.add(cab1);
		listCabs.add(cab2);
		listCabs.add(cab3);
		listCabs.add(cab4);
		listCabs.add(cab5);
		listCabs.add(cab6);
	}
	
	{
		System.out.println(" Passenger Details");
		System.out.print("Name : ");
		String  name = new Scanner(System.in).nextLine();
		System.out.print("Contact : ");
		Long  contact = new Scanner(System.in).nextLong();
		System.out.print("Email : ");
		String  email = new Scanner(System.in).nextLine();
		System.out.print("pickupLocation : ");
		String  pickup = new Scanner(System.in).nextLine();
		System.out.print("dropLocation : ");
		String  drop = new Scanner(System.in).nextLine();
		System.out.print("Seats : ");
		int seats =new Scanner(System.in).nextInt();
		
		this.passenger = new Passenger(name,contact,email,pickup,drop,seats);
		
	}
	public void homeModule()
	{
		for(; ; )
		{
			System.out.println("\n WEL-COME \n");
			System.out.println("1. BOOK A RIDE");
			System.out.println("2.  CANCEL RIDE");
			System.out.println("3. RIDE HISTORY");
			System.out.println("4. LOGOUT \n");
			System.out.println("Enter your response :");
			int response = new Scanner(System.in).nextInt();
			
			switch(response){
				case 1->bookRide();
				case 2->cancelRide();
				case 3-> rideHistory();
				case 4->{
					System.out.println("THANK YOU FOR USING UBER");
					System.exit(0);
				}
				default->System.out.println("INAVALID RESPONSE");
		}
	}
}
public void bookRide(){
	System.out.println("\n BOOK-A-RIDE MODULE\n");
	for(Cab element : listCabs)
	{
		if(element.getStatus()=="AVAIL" && passenger.getSeats()<=element.getCapacity())
		element.getCabDetials();
	}
	System.out.print("\n Enter the uberId : ");
	String uberId = new Scanner(System.in).next();
	boolean assump = false;
	for(Cab ele : listCabs){
		if(ele.getUberId().equals(uberId)){
			System.out.println("YOUR RIDE HAS BEEN CONFIRMED");
			currentCab = ele;
			assump = true;
			System.out.println("Your Ride Details");
			ele.getCabDetials();
			System.out.println("CAB Number :"+ele.getCabNumber());
			ele.getDriver().getDriver();
			break;
		}
	}
	if(!assump)
		System.out.println("\n INVALID UBER ID \n");
	
}
	public void cancelRide(){
		if(currentCab==null){
			System.out.println("\n NO RIDE HAS BEEN BOOKED \n");
			return;
		}
	System.out.println("\n CANCEL-A-RIDE MODULE \n");
	System.out.println("YOUR RIDE DETAILS");
	currentCab.getCabDetials();
	System.out.println("CAB NUMBER :"+currentCab.getCabNumber());
	currentCab.getDriver().getDriver();
	
	System.out.println("DO YOU WANT TO CANCEL YOUR RIDE (YES/NO) :");
	String resp = new Scanner(System.in).next();
		if(resp.equalsIgnoreCase("YES")){
			System.out.println("YOUR RIDE HAS BEEN CANCELED ");
			currentCab = null;
		}
	}
	public void rideHistory(){
		System.out.println("\n RIDE-HISTORY MODULE\n");
	}
}		
	
	
		
		
		

		

		