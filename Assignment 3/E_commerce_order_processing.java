class OutofstockException extends Exception{
	OutofstockException(String msg)
	{
		super(msg);
	}
}


class E_commerce_order_processing
{
	
	static void purchase(int quantity) throws OutofstockException{
	if(quantity>10)
		throw new OutofstockException("stock is insufficient");
	else
		System.out.println("stock available");}
	
	public static void main(String args[])
	{
		try{ System.out.println("testing for 5..");
			purchase(5);}
		catch(OutofstockException e){
			System.out.println("caught: "+e.getMessage());}

		try{ System.out.println("testing for 15..");
			purchase(15);}
		catch(OutofstockException e){
			System.out.println("caught: "+e.getMessage());}

			
		
			
	}

}