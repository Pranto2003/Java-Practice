import java.util.Scanner;
public class Start{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		String userName,userID,userContact;
		int balance,limit=50000,deposit,withdraw;
		System.out.println("==========WELCOME TO BUSINESS BANK==========");
		System.out.println("Which service do you want?");
		System.out.println("1. Create an Account");
		System.out.println("2.Savings");
		System.out.println("3.Overdraft");
		int choice;
		choice=num.nextInt();
		switch(choice){
			case 1: 
		System.out.println("Please fill up the form for creating an account");
		System.out.println("Enter your name ");
		userName=str.nextLine();
		System.out.println("Enter your ID ");
		userID=str.nextLine();
		System.out.println("Enter your Contact Number ");
		userContact=str.nextLine();
		System.out.println("Enter your Balance ");
		balance=num.nextInt();
		Account account=new Account(userName,userID,userContact,balance);
		account.ShowInfo();
		System.out.println("Thanks for being with us");
		System.out.println("Customer's satisfaction is our goal");
		break;
		
		case 2:
		System.out.println("Enter your information for authentication");
		System.out.println("Enter your name ");
		userName=str.nextLine();
		System.out.println("Enter your ID ");
		userID=str.nextLine();
		System.out.println("Enter your Contact Number ");
		userContact=str.nextLine();
		System.out.println("Enter your Balance ");
		balance=num.nextInt();
		System.out.println("Enter your Deposit ammount");
		deposit=num.nextInt();
	    Savings savings=new Savings(userName,userID,userContact,balance,deposit);
		savings.ShowInfo();
		System.out.println("Thanks for being with us");
		System.out.println("Customer's satisfaction is our goal");
		break;
		
		case 3:
		System.out.println("Enter your information for authentication");
		System.out.println("Enter your name ");
		userName=str.nextLine();
		System.out.println("Enter your ID ");
		userID=str.nextLine();
		System.out.println("Enter your Contact Number ");
		userContact=str.nextLine();
		System.out.println("Enter your Balance ");
		balance=num.nextInt();
		System.out.println("Enter your Deposit ammount");
		deposit=num.nextInt();
		System.out.println("How much money do you want to withdraw ");
		withdraw=num.nextInt();
		Overdraft over=new Overdraft(userName,userID,userContact,balance,deposit,withdraw);
		over.ShowInfo();
		System.out.println("Thanks for being with us");
		System.out.println("Customer's satisfaction is our goal");
		break;
		
		default:
		System.out.println("You have clicked wrong dial, Please check and try again");
		}
		
	}
}