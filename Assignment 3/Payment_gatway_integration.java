interface UPIPayment
{
	void payViaUPI();
}
interface CardPayment
{
	void CardPayment();
}
class OnlinePayment implements UPIPayment,CardPayment
{
	public void payViaUPI()
	{
		System.out.println("this is payviaUPIclass");
	}
	public void CardPayment()
	{
		System.out.println("this is cardpayment");
	}
}
class Payment_gatway_integration{
    public static void main(String args[])
    {
        OnlinePayment obj=new OnlinePayment();
	obj.payViaUPI();
	obj.CardPayment();
    }
}
