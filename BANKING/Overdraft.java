public class Overdraft extends Savings{
	private int limit=15000;
	private int withdraw;
	private int newBalance;
	//empty constructor
	public Overdraft(){
		System.out.println("Empty Constructor --> Overdraft");
	}
	public Overdraft(String Name, String ID, String Contact, int Balance, int Deposit,int withdraw){
		super(Name,ID,Contact,Balance,Deposit);
		setWithdraw(withdraw);
	}
	//setter methods
	public void setWithdraw(int withdraw){
		this.withdraw=withdraw;
	}
	//getter methods
	public int getWithdraw(){
		return this.withdraw;
	}
	public int getnewBalance(){
		newBalance=getCurrentBalance()-this.withdraw;
		return newBalance;
	}
	
	
	//display data
	public void ShowInfo(){

		super.ShowInfo();
		if(withdraw<=limit){
			System.out.println("You have successfully withdrawed "+this.withdraw+" taka");
		}
		else{
			System.out.println("You can't withdraw more than 15000 taka in one month");
		}
		System.out.println("Your current balance after the withdraw :"+getnewBalance());
	}
	
	
}