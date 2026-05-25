import java.util.*;
import java.io.*;
abstract class payment
{
	abstract void payment(String trans_id,int amount);	
}
class CreditCardPayment extends payment
{
	void payment(String trans_id,int amount)
	{
		int fee=((amount*2)/100);
		int total_fee=amount+fee;
		System.out.println("Addition fee is:"+fee);
		System.out.println("total fee:"+total_fee);

	}
}
class PayPalPayment extends payment
{
	void payment(String trans_id,int amount)
	{
		int fee=((amount*3)/100);
		int total_fee=amount+fee;
		System.out.println("Transaction id is "+trans_id);
		System.out.println("Addition fee is:"+fee);
		System.out.println("total fee:"+total_fee);

	}

}

class online_payment_system
{
	public static void main(String args[])
    	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter transaction id:");
		String trans_id=sc.nextLine();
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		
		 System.out.println("Enter choice:");
		System.out.println("press 0 for creadit");
		System.out.println("press 1 for paypal");
		int choice=sc.nextInt();

		if(choice==0)
		{
			CreditCardPayment obj1=new CreditCardPayment();
			obj1.payment(trans_id,amount);
		}
		else if(choice==1)
		{
		 PayPalPayment obj2=new  PayPalPayment();
		obj2.payment(trans_id,amount);
		}
		else System.out.println("wrong input");
		
	}
		
}

