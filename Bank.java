import java.util.Scanner;

class Bank {
    static String name;
    static long contact;
    static int pin;
    static double balance;
    static final long ACCOUNT_NUMBER = (long)(Math.random() * 100000000L); 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println();
            System.out.println("    WELCOME!!! ");
            System.out.println("STATE BANK OF INDIA");
            System.out.println();
            System.out.println("1. EXISTING USER");
            System.out.println("2. CREATE ACCOUNT");
            System.out.println();
            System.out.print("Enter Option: ");

            switch (sc.nextInt()) {
                case 1: {
                    System.out.println();
                    if (name == null) {
                        System.out.println("Create your account first");
                        continue;
                    }
                    System.out.println("\n    Login");
                    System.out.print("PhoneNo: ");
                    long phone = sc.nextLong();
                    System.out.print("Pin: ");
                    int pin1 = sc.nextInt();

                    if (contact == phone && pin1 == pin) {
                        System.out.println("\nLogin Successfully");

                        for (; ; ) {
                            System.out.println("\n    HOME");
                            System.out.println("1. Diposit Amount");
                            System.out.println("2. Withdraw Amount");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Account Info");
                            System.out.println("5. LogOut");
                            System.out.print("Enter an Option: ");
                            int opt = sc.nextInt();

                            switch (opt) {
                                case 1: {
                                    System.out.println("Deposit Module");
                                    System.out.print("Enter an amount: ");
                                    double depositAmt = sc.nextDouble();
                                    balance += depositAmt;
                                    System.out.println("Amount Deposited successfully");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Withdraw Module");
                                    System.out.print("Enter your amount: ");
                                    double withAmt = sc.nextDouble();
                                    System.out.print("Enter your pin: ");
                                    int pin2 = sc.nextInt();
                                    if (pin == pin2) {
                                        if (withAmt <= balance) {
                                            balance -= withAmt;
                                            System.out.println("Amount Withdrawn Successfully");
                                        } else {
                                            System.out.println("Insufficient Funds");
                                        }
                                    } else {
                                        System.out.println("Invalid Pin");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Check Balance Module");
                                    System.out.print("Enter your pin: ");
                                    int pin3 = sc.nextInt();
                                    if (pin3 == pin) {
                                        System.out.println("Available balance is: " + balance + " rs");
                                    } else {
                                        System.out.println("Invalid pin");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("Account Info Module");
                                    System.out.println("Account Holder Name: " + name);
                                    System.out.println("Contact: " + contact);
                                    System.out.println("Account Number: " + ACCOUNT_NUMBER);
                                    break;
                                }
                                case 5: {
                                    System.out.println("Thank You and Visit Again");
                                    break;
                                }
                                default: {
                                    System.out.println("Invalid Option");
                                }
                            }
                            if (opt == 5) break;
                        }
                    } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;
                }

                case 2: {
                    sc.nextLine(); 
                    System.out.println("\nCREATE ACCOUNT");
                    System.out.print("Enter your Name: ");
                    name = sc.nextLine();
                    System.out.print("Contact Number: ");
                    contact = sc.nextLong();
                    System.out.print("New pin: ");
                    pin = sc.nextInt();
                    System.out.print("Amount Deposit: ");
                    balance = sc.nextDouble();
                    System.out.println("Account Created Successfully");
                    break;
                }

                default: {
                    System.out.println("Invalid Option. Please select 1 or 2.");
                }
            }
        }
    }
}