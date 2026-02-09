

import java.util.Scanner;

class Bank {
    String name;
    long accountNumber;
    long atmNumber;
    int cvv;

    public Bank(String name, long accountNumber, long atmNumber, int cvv) {
        super();
        this.name = name;
        this.accountNumber = accountNumber;
        this.atmNumber = atmNumber;
        this.cvv = cvv;
    }

    public String displayBank() {
        return "Bank [name=" + name + ", accountNumber=" + accountNumber +
                ", atmNumber=" + atmNumber + ", cvv=" + cvv + "]";
    }
}


class Payment {
    String name;
    String emailId;
    long contact;
    Bank bank;

    public Payment(String name, String emailId, long contact, Bank bank) {
        super();
        this.name = name;
        this.emailId = emailId;
        this.contact = contact;
        this.bank = bank;
    }

    public String displayPayment() {
        return "Payment [name=" + name + ", emailId=" + emailId +
                ", contact=" + contact + ", bank=" + bank.displayBank() + "]";
    }

    public void paymentMethod(Payment obj) {
        if (obj instanceof PhonePay) {
            PhonePay obj1 = (PhonePay) obj;
            System.out.println("\nPayment Option: " + obj1.paymentOption);
            System.out.println(obj1.displayPayment());
            obj1.splitBill();
        } else if (obj instanceof GooglePay) {
            GooglePay obj1 = (GooglePay) obj;
            System.out.println("\nPayment Option: " + obj1.paymentOption);
            System.out.println(obj1.displayPayment());
            obj1.tapToPay();
        } else {
            System.out.println("Invalid Payment Type!");
        }
    }
}

class GooglePay extends Payment {
    String paymentOption = "GOOGLE_PAY";

    public GooglePay(String name, String emailId, long contact, Bank bank) {
        super(name, emailId, contact, bank);
    }

    public void tapToPay() {
        System.out.println("TAP and Pay successful!");
    }
}

class PhonePay extends Payment {
    String paymentOption = "PHONE_PAY";

    public PhonePay(String name, String emailId, long contact, Bank bank) {
        super(name, emailId, contact, bank);
    }

    public void splitBill() {
        System.out.println("Bill split successfully!");
    }
}

public class PaymentModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWELCOME TO PAYMENT PORTAL");
            System.out.println("1. PhonePay");
            System.out.println("2. GooglePay");
            System.out.println("3. COD");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    PhonePay obj = new PhonePay("Ramesh Kumar", "ramesh@gmail.com",
                            9876543210L, new Bank("SBI", 9873543754571L, 3536768768461L, 123));
                    obj.paymentMethod(obj);
                    break;
                }
                case 2: {
                    GooglePay obj = new GooglePay("Ramesh Kumar", "ramesh@gmail.com",
                            9876543210L, new Bank("SBI", 9873543754571L, 3536768768461L, 123));
                    obj.paymentMethod(obj);
                    break;
                }
                case 3: {
                    System.out.println("YOU SELECTED COD — Keep your cash ready!");
                    break;
                }
                case 4: {
                    System.out.println("Thank you for using Payment Portal!");
                    sc.close();
                    System.exit(0);
                }
                default: {
                    System.out.println("INVALID RESPONSE!");
                }
            }
        }
    }
}