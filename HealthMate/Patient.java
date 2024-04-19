public class Patient extends Person{
	private double Salary;
	private String Designation;
	
	//parameterized constructor
	public Patient(String Name, String ID, int Age, String Gender,
	               String Designation, double Salary){
		super(Name,ID,Age,Gender);
		setDesignation(Designation);
		setSalary(Salary);
	}
	
	//setter methods
	public void setDesignation(String Designation){
		this.Designation=Designation;
	}
	public void setSalary(double Salary){
		this.Salary=Salary;
	}
	
	//getter methods
	public String getDesignation(){
		return this.Designation;
	}
	public double getSalary(){
		return this.Salary;
	}
	
	//display data
	public void ShowDetails(){
		super.ShowDetails();
		System.out.println("Designation :"+this.Designation);
		System.out.println("Salary :"+this.Salary);
	}
}