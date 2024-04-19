public class Savings extends Account{
	private int Deposit;
	private int  Current_Balance;
	private double interestRate;
	
	//empty constructor
	public Savings(){
		System.out.println("Empty Constructor --> Savings");
	}
	
	//parameterized constructor
	public Savings(String Name, String ID, String Contact, int Balance, int Deposit){
		super(Name,ID,Contact,Balance);
		setDeposit(Deposit);
	}
	
	//setter methods
		
	public void setDeposit(int Deposit){
		this.Deposit=Deposit;
	}
	
	//getter methods
	public int getDeposit(){
		return this.Deposit;
	}
	
	public int getCurrentBalance(){
		Current_Balance=getBalance()+this.Deposit;
		return Current_Balance;
	}
	
	//display data
	public void ShowInfo(){
		super.ShowInfo();
		interestRate=(double)getCurrentBalance() *0.04;
		System.out.println("You have successfully deposited :"+this.Deposit);
		System.out.println("Your Current balance is :"+getCurrentBalance());
		System.out.println("We will give you a 4% interest");
		System.out.println("Your profit after applying interest rate is :"+interestRate);
		
	}
	
}