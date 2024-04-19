public class Doctors{
	public String doctorsName;
	private int visit;
	
	//parameterized constructor
	public Doctors(String doctorsName, int visit){
		this.doctorsName=doctorsName;
		setDoctorsVisit(visit);
	}
	
	//setter method
    public void setDoctorsVisit(int visit){
	    this.visit=visit;
    }
	
	//getter method
	public int getVisit(){
		return visit;
	}
	
	//display data
	public void ShowInfo(){
		System.out.println("Doctor's name :"+this.doctorsName);
		System.out.println("Doctor's visit :"+this.visit);
	}
	
}