import java.util.*;
import java.io.*;
class Product
{
	String product_name="iPhone 14";
	String price="$999";	
}
class Electronics extends Product
{
	String warranty_period="1 year";
}
class Smartphone extends Electronics
{
	String batterylife="20 hours";
	void display()
	{
		System.out.println("Feature is:");

		System.out.println("Product name:"+product_name);
		System.out.println("Price:"+price);
		System.out.println("warranty_period:"+warranty_period);
		System.out.println("Battery Life:"+batterylife);
		
	}
	
}
 class online_shopping_system
{
	public static void main(String args[])
    	{
		Smartphone obj3=new Smartphone();
		obj3.display();
	}
}

