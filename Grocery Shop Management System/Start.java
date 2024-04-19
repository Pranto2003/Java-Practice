import java.util.Scanner;
public class Start{
	public static void main(String[] args){
		Scanner str=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		String itemName,itemID,consumerName,consumerID,consumerContact,consumerAddress;
		double itemPrice;
		int itemQuantity;
		System.out.println("=== Welcome to Atlanta Grocery Shop ===");
		System.out.println("Which Product do you want to buy ?");
		itemName=str.nextLine();
		System.out.println("Enter Product ID :");
		itemID=str.nextLine();
		System.out.println("How many pieces do you want to buy ?");
		itemQuantity=num.nextInt();
		System.out.println("Enter the price of the product here :");
		itemPrice=num.nextDouble();
		System.out.println("Enter your name :");
		consumerName=str.nextLine();
		System.out.println("Enter your ID :");
		consumerID=str.nextLine();
		System.out.println("Enter your contact number :");
		consumerContact=str.nextLine();
		System.out.println("Enter your address here :");
		consumerAddress=str.nextLine();
		Customer cus=new Customer(itemName,itemID,itemQuantity,itemPrice,consumerName,consumerID,consumerContact,consumerAddress);
		cus.ShowInfo();
		
	}
}