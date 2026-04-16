import java.io.*;
import java.util.*;
class third
{
	int i,loc,min;
	void gcd1(int x, int y)
	{
		if(x>y)
			min=y;
		else
			min=x;
		for(i=1;i<=min;i++)
		{
			if(x%i==0 && y%i==0)
				loc=i;
						}
			System.out.println(loc);
		
	}
}
class GCD
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fst no:");
		x=sc.nextInt();
		System.out.println("Enter sec no:");
		y=sc.nextInt();

		obj.gcd1(x,y);
			}
}