public class Service{
	private String HolderID;
	private int Payment;
	private NightClub nightclubs[];
	
	//empty constructor
	public Service(){
		nightclubs=new NightClub[5];
	}
	
	//parameterized constructor
	public Service(String HolderID, int Payment, int size){
		setHolderID(HolderID);
		setPayment(Payment);
		nightclubs=new NightClub[size];
	}
	
	//setter methods
	public void setHolderID(String HolderID){
		this.HolderID=HolderID;
	}
	public void setPayment(int Payment){
		this.Payment=Payment;
	}
	
	//getter methods
	public String getHolderID(){
		return this.HolderID;
	}
	public int getPayment(){
		return this.Payment;
	}
	
	//display data
	public void ShowAllInfo(){
		for(int i=0; i<nightclubs.length; i++){
			if(nightclubs[i]!=null){
				nightclubs[i].ShowInfo();
				System.out.println("Holder's ID :"+this.HolderID);
				System.out.println("Holder's Payment :"+this.Payment);
			}
		}
	}
	
	//adding data
	public void AddCustomer(NightClub night){
		boolean adding=false;
		for(int i=0; i<nightclubs.length; i++){
			if(nightclubs[i]==null){
				nightclubs[i]=night;
				adding=true;
				break;
			}
		}
		if(adding){
			System.out.println("Customer Added Successfully");
		}
		else{
			System.out.println("Not Enough Space to add new Customer");
		}
	}
	
	//deleting data
	public void DeleteCustomerData(NightClub night){
		boolean deleting=false;
		for(int i=0; i<nightclubs.length; i++){
			if(nightclubs[i]!=null){
				nightclubs[i]=null;
				deleting=true;
				break;
			}
		}
		if(deleting){
			System.out.println("Customer Data Deleted Successfully");
		}
		else{
			System.out.println("Customer Data Not Found");
		}
	}
	
	//searching by id for payment
	public void SearchingForPayment(String ID){
		for(int i=0; i<nightclubs.length; i++){
			if(nightclubs[i]!=null && nightclubs[i].getID().equals(ID) && ID.charAt(3)==3){
				System.out.println("Silver Membership");
			}
			else if(nightclubs[i]!=null && nightclubs[i].getID().equals(ID) && ID.charAt(3)==4){
				System.out.println("Golden Membership");
			}
			else if(nightclubs[i]!=null && nightclubs[i].getID().equals(ID) && ID.charAt(3)==5){
				System.out.println("Diamond Membership");
			}
			else{
				System.out.println("No results found");
			}
		}
	}
}