public class Product{
	private String productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private double TotalPrice;
	
	//Parameterized Constructor
	public Product(String productName,String productID, int productQuantity, double productPrice){
		setproductID(productID);
		setproductName(productName);
		setproductQuantity(productQuantity);
		setproductPrice(productPrice);
	}
	
	//setter methods
	public void setproductID(String productID){
		this.productID=productID;
	}
	public void setproductName(String productName){
		this.productName=productName;
	}
	public void setproductQuantity(int productQuantity){
		this.productQuantity=productQuantity;
	}
	public void setproductPrice(double productPrice){
		this.productPrice=productPrice;
	}
	
	//getter methods
	public String getproductID(){
		return this.productID;
	}
	public String getproductName(){
		return this.productName;
	}
	public int getproductQuantity(){
		return this.productQuantity;
	}
	public double getproductPrice(){
		return this.productPrice;
	}
	
	//display data
	public void ShowInfo(){
		TotalPrice=(double)this.productQuantity*this.productPrice;
		System.out.println("----------");
		System.out.println("Product Name :"+this.productName);
		System.out.println("Product ID :"+this.productID);
		System.out.println("Product Quantity :"+this.productQuantity);
		System.out.println("Product Price :"+this.productPrice);
	}
	
	
}