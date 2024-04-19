public class Customer extends Product{
	private String CustomerName;
	private String CustomerID;
	private String CustomerContact;
	private String CustomerAddress;
	//Parameterized Constructor
	public Customer(String productName,String productID, int productQuantity, double productPrice,String CustomerName, String CustomerID, String CustomerContact, String CustomerAddress){
		super(productName,productID,productQuantity,productPrice);
		setCustomerName(CustomerName);
		setCustomerID(CustomerID);
		setCustomerContact(CustomerContact);
		setCustomerAddress(CustomerAddress);
	}
	
	//setter methods
	public void setCustomerName(String CustomerName){
		this.CustomerName=CustomerName;
	}
	public void setCustomerID(String CustomerID){
		this.CustomerID=CustomerID;
	}
	public void setCustomerContact(String CustomerContact){
		this.CustomerContact=CustomerContact;
	}
	public void setCustomerAddress(String CustomerAddress){
		this.CustomerAddress=CustomerAddress;
	}
	
	//getter methods
	public String getCustomerName(){
		return this.CustomerName;
	}
	public String getCustomerID(){
		return this.CustomerID;
	}
	public String getCustomerContact(){
		return this.CustomerContact;
	}
	public String getCustomerAddress(){
		return this.CustomerAddress;
	}
	
	//display data
	public void ShowInfo(){
		super.ShowInfo();
		System.out.println("Customer's Name :"+this.CustomerName);
		System.out.println("Customer's ID :"+this.CustomerID);
		System.out.println("Customer's Contact :"+this.CustomerContact);
		System.out.println("Customer's Address :"+this.CustomerAddress);
		System.out.println("Total Price :"+TotalPrice);
	}
}