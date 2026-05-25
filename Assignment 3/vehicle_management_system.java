import java.util.*;
import java.io.*;
class Vehicle
{
	String brand;
	String model;
	int year;
	Vehicle(String b, String mod, int ye)
	{
		brand=b;
		model=mod;
		year=ye;
		
	}
	
}
class Car extends Vehicle
{
	String fueltype;
	Car(String b, String mod, int ye,String fuel)
	{
		super(b,mod,ye);
		fueltype=fuel;
	}
	void display()
	{
		System.out.println("Feature is:");
	}
}
class LuxuryCar extends Car
{
	String feature;
	LuxuryCar(String b, String mod, int ye,String fuel,String fea)
	{
		super(b,mod,ye,fuel);
		feature=fea;
	}
	void display()
	{
		System.out.println("Feature is:");

		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
		System.out.println("Fuel Type:"+fueltype);
		System.out.println("Feature:"+feature);
	}
	
}
 class vehicle_management_system
{
	public static void main(String args[])
    	{
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter brand:");
		String brand=sc.nextLine();

		System.out.print("Enter model:");
		String model=sc.nextLine();

		System.out.print("Enter year:");
		int year=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter fueltype:");
		String fueltype=sc.nextLine();
		
		System.out.print("Enter feature:");
		String feature=sc.nextLine();		
		System.out.println();


		LuxuryCar obj3=new LuxuryCar(brand,model,year,fueltype,feature);
		obj3.display();
	}

}