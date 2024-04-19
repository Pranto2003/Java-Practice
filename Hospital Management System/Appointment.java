public class Appointment extends Doctors{
	private String AppointmentHoldersName;
	private String AppointmentHoldersID;
	private String AppointmentHoldersContact;
	
	//parameterized constructor
	public Appointment(String doctorsName, int visit, String AppointmentHoldersName, String AppointmentHoldersID, String AppointmentHoldersContact){
		super(doctorsName,visit);
		setAppointmentHoldersName(AppointmentHoldersName);
		setAppointmentHoldersID(AppointmentHoldersID);
		setAppointmentHoldersContact(AppointmentHoldersContact);
	}
	
	//setter methods
	public void setAppointmentHoldersName(String AppointmentHoldersName){
		this.AppointmentHoldersName=AppointmentHoldersName;
	}
	public void setAppointmentHoldersID(String AppointmentHoldersID){
		this.AppointmentHoldersID=AppointmentHoldersID;
	}
	public void setAppointmentHoldersContact(String AppointmentHoldersContact){
		this.AppointmentHoldersContact=AppointmentHoldersContact;
	}
	
	//getter methods
	public String getAppointmentHoldersName(){
		return this.AppointmentHoldersName;
	}
	public String getAppointmentHoldersID(){
		return this.AppointmentHoldersID;
	}
	public String getAppointmentHoldersContact(){
		return this.AppointmentHoldersContact;
	}
	
	//display data
	public void ShowInfo(){
		super.ShowInfo();
		System.out.println("Appointment Holder's Name :"+this.AppointmentHoldersName);
		System.out.println("Appointment Holder's ID :"+this.AppointmentHoldersID);
		System.out.println("Appointment Holder's Contact :"+this.AppointmentHoldersContact);
	}
	
}