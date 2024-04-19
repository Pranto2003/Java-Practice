public class NightClub{
	private String CustomerName;
	private String ID;
	private String Age;
	private String Gender;
	private String Contact;
	private String Membership;
	
	//parameterized constructor
	public NightClub(String CustomerName, String ID, String Age,
	                       String Gender, String Contact){
							   
        setCustomerName(CustomerName);		
        setID(ID);		
        setAge(Age);		
        setGender(Gender);
        setContact(Contact);	
	}
	
	//setter methods
	public void setCustomerName(String CustomerName){
		this.CustomerName=CustomerName;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public void setAge(String Age){
		this.Age=Age;
	}
	public void setGender(String Gender){
		this.Gender=Gender;
	}
	public void setContact(String Contact){
		this.Contact=Contact;
	}
	
	//getter methods
	public String getCustomerName(){
		return this.CustomerName;
	}
	public String getID(){
		return this.ID;
	}
	public String getAge(){
		return this.Age;
	}
	public String getGender(){
		return this.Gender;
	}
	public String getContact(){
		return this.Contact;
	}
	
	//display data
	public void ShowInfo(){
		System.out.println("Customer's Name :"+this.CustomerName);
		System.out.println("Customer's ID :"+this.ID);
		System.out.println("Customer's Age :"+this.Age);
		System.out.println("Customer's Gender :"+this.Gender);
		System.out.println("Customer's Contact :"+this.Contact);
	}
	
	
}