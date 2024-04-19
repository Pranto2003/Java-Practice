public class Account{
	protected String Name;
	protected String ID;
	protected String Contact;
	private int Balance;
	
	//empty constructor
	public Account(){
		System.out.println("Empty Constructor --> Account");
	}
	//parameterized constructor
	public Account(String Name, String ID, String Contact, int Balance) {
		this.Name=Name;
		this.ID=ID;
		this.Contact=Contact;
		this.Balance=Balance;
	}
	//setter methods
	public void setName(String Name){
		this.Name=Name;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public void setContact(String Contact){
		this.Contact=Contact;
	}
	public void setBalance(int Balance){
		this.Balance=Balance;
	}
	//getter methods
	public String getName(){
		return this.Name;
	}
	public String getID(){
		return this.ID;
	}
	public String getContact(){
		return this.Contact;
	}
	public int getBalance(){
		return this.Balance;
	}
	
	
	//display data
	public void ShowInfo(){
		System.out.println("NAME :"+this.Name);
		System.out.println("ID :"+this.ID);
		System.out.println("CONTACT :"+this.Contact);
		System.out.println("BALANCE :"+this.Balance);
		
	}
}