import java.util.*;

class Driver {
    private String name;
    private Long contact;

    Driver(String name, Long contact) {
        this.name = name;
        this.contact = contact;
    }

    public void getDriver() {
        System.out.println("\nDriver Info");
        System.out.println("Driver Name: " + name);
        System.out.println("Contact: " + contact + "\n");
    }
}

class Cab {
    static int id = 345678;
    private Driver driver;
    private String number;
    private String uberId;
    private String type;
    private int capacity;
    private String status = "Available";
    private String location = "Deccan";

    String[] typeVehicle = {"hatchback", "sedan", "suv", "muv"};
    int[] vehicleCapacity = {3, 4, 5, 6};

    {
        this.uberId = "UBER" + id++;
    }

    Cab(String number, String type, Driver driver) {
        this.number = number;
        this.type = type.toLowerCase();
        int indx = -1;
        for (int i = 0; i < typeVehicle.length; i++) {
            if (typeVehicle[i].equals(this.type)) {
                indx = i;
                break;
            }
        }
        if (indx == -1) {
            throw new IllegalArgumentException("Invalid cab type: " + type);
        }
        this.capacity = vehicleCapacity[indx];
        this.driver = driver;
    }

    public void getCabDetails() {
        System.out.println("\nCAB DETAILS");
        System.out.println("Uber ID: " + uberId);
        System.out.println("Status: " + status);
        System.out.println("Cab Number: " + number);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Location: " + location + "\n");
    }

    public String getCabNumber() {
        return number;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getUberId() {
        return uberId;
    }
}

class Passenger {
    private String name;
    private Long contact;
    private String email;
    private String pickupLocation;
    private String dropLocation;
    private int seats;

    Passenger(String name, Long contact, String email, String pickupLocation, String dropLocation, int seats) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public Long getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public int getSeats() {
        return seats;
    }
}

class Uber {
    ArrayList<Cab> listCabs = new ArrayList<>();
    Passenger passenger;
    Cab currentCab;
    Scanner sc = new Scanner(System.in);

    Uber() {
        listCabs.add(new Cab("MH-01-1231", "sedan", new Driver("Ramesh Kumar", 123456783L)));
        listCabs.add(new Cab("MH-16-1232", "suv", new Driver("Mukesh Kumar", 1234567933L)));
        listCabs.add(new Cab("MH-12-1233", "hatchback", new Driver("Dinesh Kumar", 1234567633L)));
        listCabs.add(new Cab("MH-14-1234", "muv", new Driver("Ganesh Kumar", 1234567544L)));
        listCabs.add(new Cab("MH-23-1235", "sedan", new Driver("Hitesh Kumar", 1234567455L)));
        listCabs.add(new Cab("MH-11-1236", "hatchback", new Driver("Suresh Kumar", 1234567355L)));

        System.out.println("Passenger Details");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Contact: ");
        Long contact = sc.nextLong();
        sc.nextLine(); // consume newline
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Pickup Location: ");
        String pickup = sc.nextLine();
        System.out.print("Drop Location: ");
        String drop = sc.nextLine();
        System.out.print("Seats: ");
        int seats = sc.nextInt();

        this.passenger = new Passenger(name, contact, email, pickup, drop, seats);
    }

    public void homeModule() {
        while (true) {
            System.out.println("\nWELCOME\n");
            System.out.println("1. BOOK A RIDE");
            System.out.println("2. CANCEL RIDE");
            System.out.println("3. RIDE HISTORY");
            System.out.println("4. LOGOUT\n");
            System.out.print("Enter your response: ");
            int response = sc.nextInt();

            switch (response) {
                case 1 -> bookRide();
                case 2 -> cancelRide();
                case 3 -> rideHistory();
                case 4 -> {
                    System.out.println("THANK YOU FOR USING UBER");
                    System.exit(0);
                }
                default -> System.out.println("INVALID RESPONSE");
            }
        }
    }

    public void bookRide() {
        System.out.println("\nBOOK-A-RIDE MODULE\n");
        for (Cab element : listCabs) {
            if (element.getStatus().equalsIgnoreCase("Available") && passenger.getSeats() <= element.getCapacity()) {
                element.getCabDetails();
            }
        }

        System.out.print("\nEnter the Uber ID: ");
        String uberId = sc.next();
        boolean found = false;

        for (Cab ele : listCabs) {
            if (ele.getUberId().equalsIgnoreCase(uberId)) {
                ele.setStatus("Booked");
                currentCab = ele;
                found = true;
                System.out.println("YOUR RIDE HAS BEEN CONFIRMED");
                ele.getCabDetails();
                System.out.println("CAB Number: " + ele.getCabNumber());
                ele.getDriver().getDriver();
                break;
            }
        }

        if (!found) {
            System.out.println("\nINVALID UBER ID\n");
        }
    }

    public void cancelRide() {
        if (currentCab == null) {
            System.out.println("\nNO RIDE HAS BEEN BOOKED\n");
            return;
        }

        System.out.println("\nCANCEL-A-RIDE MODULE\n");
        System.out.println("YOUR RIDE DETAILS");
        currentCab.getCabDetails();
        System.out.println("CAB NUMBER: " + currentCab.getCabNumber());
        currentCab.getDriver().getDriver();

        System.out.print("DO YOU WANT TO CANCEL YOUR RIDE (YES/NO): ");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("YES")) {
            currentCab.setStatus("Available");
            currentCab = null;
            System.out.println("YOUR RIDE HAS BEEN CANCELED");
        }
    }

    public void rideHistory() {
        System.out.println("\nRIDE-HISTORY MODULE\n");
        if (currentCab != null) {
            System.out.println("Current Ride:");
            currentCab.getCabDetails();
        } else {
            System.out.println("No ride history available.");
        }
    }
}

class UberDriver {
    public static void main(String[] args) {
        Uber uber = new Uber();
        uber.homeModule();
    }
}