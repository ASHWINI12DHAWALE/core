import java.util.Scanner;

public class MainApplication 
{

	public static void main(String[] args) 
	{
		
		int i;
		int choice;
		//Account a=new Account();
		Account[] users = new Account[3];
		for(i=0;i<users.length;i++)
		{
			users[i]=new Account();
		}
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\n1.Accept   2.Display  3.Withdraw    4.Depist   5.InterestRate  6.Exit\n");
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:	
				for(i=0;i<3;i++)
				{
					users[i].acceptData();
					
				}
				break;
		case 2:
				for(i=0;i<3;i++)
				{
					users[i].displayData();
				}
				break;
		case 3:
				int accNum;
			
				System.out.println("Enter id : ");
				accNum=sc.nextInt();
				for(i=0;i<users.length;i++)
				{
					if(accNum==users[i].id)
					{
						users[i].withdrawMoney();
					}
				}
				break;
		case 4:
			int acctNum;
		
			System.out.println("Enter id : ");
			acctNum=sc.nextInt();
			for(i=0;i<users.length;i++)
			{
				if(acctNum==users[i].id)
				{
					users[i].depositeMoney();
				}
			}
			break;
		case 5:
			int acct;
			
			System.out.println("Enter id : ");
			acct=sc.nextInt();
			for(i=0;i<users.length;i++)
			{
				if(acct==users[i].id)
				{
					users[i].interestRate();
				}
			}
			break;
		case 6:exit(0);break;
		default:System.out.println("Wrong choice...\n");	
		}
				
		}while(choice!=6);
		
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
