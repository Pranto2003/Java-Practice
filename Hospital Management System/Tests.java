import java.util.Scanner;
public class Tests extends Appointment{
    protected int test;
	String testName[];
	Scanner num1=new Scanner(System.in);
	Scanner str1=new Scanner(System.in);
	
	//parameterized constructor
	public Tests(String doctorsName, int visit, String AppointmentHoldersName, String AppointmentHoldersID, String AppointmentHoldersContact, int test){
       super(doctorsName,visit,AppointmentHoldersName,AppointmentHoldersID,AppointmentHoldersContact);
	   setTest(test);
	}
	
	//setter methods
	public void setTest(int test){
		testName=new String[test];
		System.out.println("Enter your tests names here :");
		for(int i=1;i<=test;i++){
			testName[i]=str1.nextLine();
		}
		System.out.println("Your tests are :");
		for(int i=1;i<=test;i++){
			System.out.println(testName[i]);
			}
		
	}
	
	//display data
	public void ShowInfo(){
		super.ShowInfo();
	
	}
	
}