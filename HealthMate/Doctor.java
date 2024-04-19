public class Doctor extends Person{
	private String Qualification;
	private String Designation;
	private double Salary;
	
	//parameterized constructor
	public Doctor(String Name, String ID, int Age, String Gender,
	                 String Qualification, String Designation, double Salary){
		super(Name,ID,Age,Gender);
		setQualification(Qualification);
		setDesignation(Designation);
		setSalary(Salary);
	}
	
	//setter methods
	public void setQualification(String Qualification){
		this.Qualification=Qualification;
	}
	public void setDesignation(String Designation){
		this.Designation=Designation;
	}
	public void setSalary(double Salary){
		this.Salary=Salary;
	}
	
	//getter methods
	public String getQualification(){
		return this.Qualification;
	}
	public String getDesignation(){
		return this.Designation;
	}
	public double getSalary(){
		return this.Salary;
	}
	
	//display data
	public void ShowDetails(){
		super.ShowDetails();
		System.out.println("Qualification :"+this.Qualification);
		System.out.println("Designation :"+this.Designation);
		System.out.println("Salary :"+this.Salary);
	}
}