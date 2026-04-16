import java.io.*;
import java.util.*;
class BankAccount
{
	String ac_no,name;
	int balance=0,amount;
	void deposit(int ac_no,String name)
	{	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the amount:");
		amount=sc.nextInt();

		balance=balance+amount;
		System.out.println("Account no: "+ac_no+" Name: "+name+" new balance: "+balance);
		
		
	}
	void withdraw(int ac_no,String name)
	{
		Scanner sc=new Scanner(System.in);
		int amount;
		System.out.println("Enter the amount:");
		amount=sc.nextInt();

		if(balance==0)
		{
			System.out.println("balance is not sufficient, you need to add balance");
		}
		else if(amount<balance)
		{
				
		balance=balance-amount;
		System.out.println("Account no: "+ac_no+" Name: "+name+" new balance: "+balance);
		}

		else if(amount>balance)
		{
			
		
			System.out.println("you don't have sufficient balance");
		}
		
	}

	
}
class BankAccount
{
	public static void main(String a[])
	{
		int n,ac_no;
		String name;
		BankAccount obj=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AC NO:");
		ac_no=sc.nextInt();
		System.out.println("Enter customer name:");
		name=sc.next();
		
		

		while(true)
		{
			System.out.println("Enter 1 for deposit or 2 for withdraw or 0 for exit:");
			n=sc.nextInt();
			if(n==1)
			
				obj.deposit(ac_no,name);
			
			else if(n==2)
				obj.withdraw(ac_no,name);
			else if(n==0)
				System.exit(0);
			else
			System.out.println("wrong input");
		}
		
		
	}
}