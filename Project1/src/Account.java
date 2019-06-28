import java.util.Scanner;

public class Account 
{
	int id;
	String name;
	float balance;
	String address;
	Date acctopen=new Date();
	
	Account()
	{
		id=0;
		name=null;
		balance=0;
		address=null;
	}
	Account(int aid,String nm,float bal,String addr, int dd,int mm,int yy)
	{
		this.id=aid;
		this.name=nm;
		this.balance=bal;
		this.address=addr;
		this.acctopen=acctopen;
	}
	void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Balance :");
		balance=sc.nextFloat();
		System.out.println("Enter Address :");
		address=sc.next();
		
		acctopen.acceptDate();
		
		
	}
	void depositeMoney()
	{
		float depositAmount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount :");
		depositAmount=sc.nextFloat();
		
		balance = balance+depositAmount;
		System.out.println("After deposit :"+balance);
		
	}
	
	void displayData()
	{
		System.out.println("ID  ="+id);
		System.out.println("Name  ="+name);
		System.out.println("Balance  ="+balance);
		System.out.println("Address  ="+address);
		
		acctopen.displayDate();
		System.out.println("\n");
	}
	void withdrawMoney()
	{
        float withdrawAmount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount :");
		withdrawAmount=sc.nextFloat();
		
		balance = balance-withdrawAmount;
		System.out.println("After withdraw :"+balance);
	}
	void interestRate()
	{
			int n = 2;
		float r = 0.03f;
		
		float I = (balance*n*r)/100;
		System.out.println("Rate of interest :"+I);
	}

}
