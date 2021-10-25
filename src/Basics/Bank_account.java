package Basics;
import java.util.*;

class Bank {
	
	public String name,type;
	public int accountnumber,balance=0;

	Scanner sc=new Scanner(System.in);
	
	void assignValues() {
		
		System.out.println("Enter name");
		name=sc.nextLine();
		
		System.out.println("Enter Account number");
		accountnumber=sc.nextInt();
		
		System.out.println("Enter type of account");
		type=sc.next();
		
		System.out.println("Enter balance amount in the account");
		balance=sc.nextInt();
		
	}
	
	void depositAmount() {
		
		System.out.println("Enter amount to be deposited");
		int amount;
		amount=sc.nextInt();
		
		balance += amount;
		
	}
	
	void withdraw() {
		System.out.println("Balance in account is "+balance);
		System.out.println("Enter amount to be withdrawn");
		int amount;
		amount=sc.nextInt();
		
		balance -= amount;
		sc.close();
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Balance : "+balance);
	}
}

public class Bank_account{
	public static void main(String args[]) {
		
		Bank account=new Bank();
		
		account.assignValues();
		account.depositAmount();
		account.withdraw();
		account.display();
	}
}
