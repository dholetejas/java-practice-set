import java.util.*;
class Application{
static String userName;
static String email;
static String contact;
static String address;
static String password;
static ArrayList<String> cart = new ArrayList<>();
static double totalBill;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
outerLoop:
for(;;)
{
System.out.println();
System.out.println("	**WELCOME**	");
System.out.println();
System.out.println("1.NEW USER");
System.out.println("2>LOGIN");
System.out.println();
System.out.print("Enter your option");
int opt=sc.nextInt();
System.out.println();
switch(opt)
{
case 1->newUser();
case 2->login();
default->System.out.println("Invalid Option");
};
}
}
public static void newUser()
{
System.out.println("NEW USER MODULE:");
System.out.println();
System.out.print("Enter username:");
userName=new Scanner(System.in).nextLine();
System.out.print("Enter the email:");
email=new Scanner(System.in).next();
System.out.print("Enter contact:");
contact=new Scanner(System.in).next();
System.out.print("Address:");
address=new Scanner(System.in).nextLine();
System.out.print("Enter the password:");
password=new Scanner(System.in).next();
System.out.println();
char ch='$';
System.out.println((char)3 +" Account created "+ch);
}
public static void login()
{
if(userName==null)
{
System.out.println("Create your account first");
return;
}
System.out.println("	**LOGIN**	");
for(int i=1,attempt=3;i<=3;i++)
{
System.out.print("Enter usrename:");
String cred1=new Scanner(System.in).nextLine();
System.out.println("enter password:");
String cred2=new Scanner(System.in).next();
if(cred1.equals(userName) || cred1.equals(contact) && cred2.equals(password))
{
homePage();
return;
}
System.out.println("wrong Credentials,Attemp left"+(attempt-1));
}
System.out.println();
System.out.println("3 attempt done");
System.out.println("You seems to be different usre");
System.out.println("Thank u & never visit again");
System.exit(0);
}
public static void homePage()
{
for(;;)
{
System.out.println();
System.out.println("	**HOMEPAGE**	");
System.out.println();
System.out.println("shop by category");
System.out.println("1. men");
System.out.println("2.women");
System.out.println("3.View cart");
System.out.println("4.Wishlist");
System.out.println("5.Orders");
System.out.println("6.Logout");
System.out.print("Enter your option:");
int opt=new Scanner(System.in).nextInt();
switch(opt)
{
case 1->shopMen();
case 2->shopWomen();
case 3->viewCart();
case 4->wishList();
case 5->order();
case 6->{System.out.println("Thank you! "+userName+" visit again");
System.exit(0);
}
default->System.out.println("Invalid option");
};
}
}
public static void shopMen()
{
for(;;)
{
System.out.println();
System.out.println(" NEW SECTION ");
System.out.println("1.Clothes");
System.out.println("2.footwear");
System.out.println("3.Accesories");
System.out.println("4.Homepage\n");
System.out.print("Enter your option:");
int opt=new Scanner(System.in).nextInt();
switch(opt)
{
case 1->clothes();
case 2->footwear();
case 3->accessories();
case 4->homePage();
default->System.out.println("Invalid option:");
};
}
}
public static void clothes()
{
for(;;)
{
System.out.println("clothes");
System.out.println("101:Shirt- 799/-");
System.out.println("102:T-shirt- 699/-");
System.out.println("103:Jeans- 999/-");
System.out.println("100:Back");
System.out.print("Enter the product id:");
int prodId=new Scanner(System.in).nextInt();
switch(prodId)
{
case 101->addCart("101:Shirt- 799/-",799);
case 102->addCart("102:T-Shirt- 699/-",699);
case 103->addCart("103:Jeans- 999/-",999);
case 100->shopMen();
default->System.out.println("Invalid option");
};
}
}
public static void footwear()
{
for(;;)
{
System.out.println("FOOTWEAR MODULE");
System.out.println("104:Flipflop- 799/-");
System.out.println("105:Shoes- 1099/-");
System.out.println("106:crocs- 1999/-");
System.out.println("100:Back");
System.out.println("Enter the productId:");
int prodId=new Scanner(System.in).nextInt();
switch(prodId)
{
case 104->addCart("104:Flipflop- 799/-",799);
case 105->addCart("105:Shoes- 1099/-",1099);
case 106->addCart("106:Crocs- 1999/-",1999);
case 100->shopMen();
default->System.out.println("Invalid Product ID");
};
}
}
public static void accessories()
{
for(;;)
{
 System.out.println("Accessories MODULE");
System.out.println("107: Belt - 100/-");
System.out.println("108:Tie - 199/-");
System.out.println("109:Wallets- 299");
System.out.println("100:Back");
System.out.println("Enter your option:");
int prodId=new Scanner(System.in).nextInt();
switch(prodId)
{
case 107->addCart("107:Belt - 100/-",100);
case 108->addCart("108:Tie - 199/-",199);
case 109->addCart("109:Wallets - 299/-",299);
case 100->shopMen();
default->System.out.println("Invalid Option");
};
}
}
public static void shopWomen()
{
System.out.println("Women section");
}
public static void addCart(String item,double price)
{
cart.add(item);
totalBill+=price;
System.out.println("\n PRODUCT  ADDED SUCCESSFULLY");
}
public static void viewCart()
{char a='$';
if(cart.size()==0)
{
System.out.println("Cart is empty"+a);
return;
}
System.out.println("item in cart");
for(String item:cart)
{
System.out.println(item);
}
System.out.println("Total bill:"+totalBill+"rs");
System.out.println("\n Do you want to remove any product:");
String response=new Scanner(System.in).next();
if(response.equalsIgnoreCase("YES"))
{
System.out.print("enter the product id:");
int prodId=new Scanner(System.in).nextInt();
if(removeProductCart(prodId))
System.out.println("Product removed successfully");
else
System.out.println("Product not found");
}
}
public static boolean removeProductCart(int prodId)
{
return true;
}
public static void wishList()
{
System.out.println("Wishlist module");
}
public static void order()
{
System.out.println("\n orders\n");
}
}
