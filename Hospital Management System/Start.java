import java.util.Scanner;
public class Start{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		System.out.println("===== Welcome to Apollo Hospital =====");
		String consultantName,patientName,patientID,patientContact;
		int charge,exams;
		System.out.println("Enter Doctor's name :");
		consultantName=str.nextLine();
		System.out.println("Enter Doctor's visit :");
		charge=num.nextInt();
		System.out.println("Enter Patient's name :");
		patientName=str.nextLine();
		System.out.println("Enter Patient's ID :");
		patientID=str.nextLine();
		System.out.println("Enter Patient's Contact :");
		patientContact=str.nextLine();
		System.out.println("How many tests do you completed?");
		exams=num.nextInt();
		Tests tt=new Tests(consultantName,charge,patientName,patientID,patientContact,exams);
		tt.ShowInfo();
	}
	
	
}