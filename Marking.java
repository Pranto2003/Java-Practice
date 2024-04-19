import java.util.Scanner;
public class Marking{
	public static void main(String[] args){
		Scanner scInt=new Scanner(System.in);
	int attendance,performance,quiz1,quiz2,quiz3,quiz4,mid,Final;
	System.out.println("Enter your attendance mark");
	attendance=scInt.nextInt();
	System.out.println("Enter your performance mark");
	performance=scInt.nextInt();
	System.out.println("Enter your quiz1 mark");
	quiz1=scInt.nextInt();
	System.out.println("Enter your quiz2 mark");
	quiz2=scInt.nextInt();
	System.out.println("Enter your quiz3 mark");
	quiz3=scInt.nextInt();
	System.out.println("Enter your quiz4 mark");
	quiz4=scInt.nextInt();
	System.out.println("Enter your mid mark");
	mid=scInt.nextInt();
	System.out.println("Enter your final mark");
	Final=scInt.nextInt();
	int commid=(int)((attendance+performance+quiz1+quiz2+mid)*0.4);
	int comfin=(int)((attendance+performance+quiz3+quiz4+Final)*0.6);
	int com=commid+comfin;
	System.out.println("--------------");
	System.out.println("Your midterm exam mark is : "+(attendance+performance+quiz1+quiz2+mid));
	System.out.println("Your finalterm exam mark is : "+(attendance+performance+quiz3+quiz4+Final));
	System.out.println("Your final result is :"+com);
	
	
	}
}